package com.example.lingogemi

import android.graphics.Bitmap
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lingogemi.data.Chat
import com.example.lingogemi.data.ChatData
import com.example.lingogemi.data.ChosenLanguage
import com.google.ai.client.generativeai.type.Content
import com.google.ai.client.generativeai.type.content
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ChatViewModel: ViewModel() {

    private val _chatState = MutableStateFlow(ChatState())
    val chatState = _chatState.asStateFlow()

    var chatHistoryForGemini: MutableList<Content> = loadData()

    fun onEvent(event: ChatUiEvent) {
        when (event) {
            is ChatUiEvent.SendPrompt -> {
                if (event.prompt.isNotEmpty()) {
                    addPrompt(event.prompt, event.bitmap)
                    Log.d("HISTORY LIST: ", chatHistoryForGemini.toString())

                    if (event.bitmap != null) {
                        getResponseWithBitmap(event.prompt, event.bitmap)
                        chatHistoryForGemini.add(content(role = "user") { text(event.prompt) })
                    } else {
                        getResponse(event.prompt)
                        chatHistoryForGemini.add(content(role = "user") { text(event.prompt) })
                    }
                }
            }
            is ChatUiEvent.UpdatePrompt -> {
                _chatState.update {
                    it.copy(prompt = event.newPrompt)
                }
            }
            is ChatUiEvent.UpdateBitmap -> {
                _chatState.update {
                    it.copy(bitmap = event.newBitmap)
                }
            }
        }
    }

    private fun addPrompt(prompt: String, bitmap: Bitmap?) {
//        chatHistoryForGemini.add(content(role = "user") { text(prompt) })
        _chatState.update {
            it.copy(
                chatList = it.chatList.toMutableList().apply {
                    add(0, Chat(prompt, bitmap, true))
                },
                prompt = "",
                bitmap = null
            )
        }
    }

    private fun getResponse(prompt: String){
        viewModelScope.launch {
            val chatHistoryList = chatHistoryForGemini.toList()
            val chat = ChatData.getResponse(prompt, chatHistoryList)
            Log.d("PROMPT RESPONSE: ", chat.prompt)
            chatHistoryForGemini.add(content(role = "model") { text(chat.prompt) })
            _chatState.update {
                it.copy(
                    chatList = it.chatList.toMutableList().apply {
                        add(0, chat)
                    },
                )
            }
        }
    }

    private fun getResponseWithBitmap(prompt: String, bitmap: Bitmap){
        viewModelScope.launch {
            val chatHistoryList = chatHistoryForGemini.toList()
            val chat = ChatData.getResponse(prompt, bitmap, chatHistoryList)
            chatHistoryForGemini.add(content(role = "model") { text(chat.prompt) })
            _chatState.update {
                it.copy(
                    chatList = it.chatList.toMutableList().apply {
                        add(0, chat)
                    },
                )
            }
        }
    }
}