package com.example.lingogemi.data

import android.graphics.Bitmap
import com.google.ai.client.generativeai.BuildConfig
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.Content
import com.google.ai.client.generativeai.type.ResponseStoppedException
import com.google.ai.client.generativeai.type.content
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.google.ai.client.generativeai.type.content

object ChatData {
    val api_key = "\"${System.getenv("api.key")}\""

    suspend fun getResponse(prompt: String, history: List<Content>): Chat{
        val generativeModel = GenerativeModel(
            modelName = "gemini-pro", apiKey = api_key
        )

        try {
            val chat = generativeModel.startChat(history)
            lateinit var chatResponse: Chat

            var fullResponse = ""
            chat.sendMessageStream(prompt).collect { chunk ->
                fullResponse += chunk.text
            }

            chatResponse = Chat(
                prompt = fullResponse ?: "error",
                bitmap = null,
                isFromUser = false
            )

            return chatResponse
//            val response = withContext(Dispatchers.IO) {
//                generativeModel.generateContent(prompt)
//            }
//            return Chat(
//                prompt = response.text ?: "error",
//                bitmap = null,
//                isFromUser = false
//            )

        } catch (e: Exception){
            return Chat(
                prompt = e.message ?: "error",
                bitmap = null,
                isFromUser = false
            )
        }
    }

    suspend fun getResponse(prompt: String, bitmap: Bitmap, history: List<Content>): Chat{
        val generativeModel = GenerativeModel(
            modelName = "gemini-pro-vision", apiKey = api_key
        )

        try {
            val content = content {
                image(bitmap)
                text(prompt)
            }

            val chat = generativeModel.startChat(history)
            lateinit var chatResponse: Chat
            chat.sendMessageStream(content).collect { chunk ->
                chatResponse = Chat(
                    prompt = chunk.text ?: "error",
                    bitmap = null,
                    isFromUser = false
                )
            }
            return chatResponse

//            val response = withContext(Dispatchers.IO) {
//                generativeModel.generateContent(content)
//            }
//            return Chat(
//                prompt = response.text ?: "error",
//                bitmap = null,
//                isFromUser = false
//            )

        } catch (e: Exception){
            return Chat(
                prompt = e.message ?: "error",
                bitmap = null,
                isFromUser = false
            )
        }

    }
}