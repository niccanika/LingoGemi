package com.example.lingogemi

import android.graphics.Bitmap
import com.example.lingogemi.data.Chat

data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)