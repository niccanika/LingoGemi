package com.example.lingogemi

import com.example.lingogemi.data.ChosenLanguage
import com.google.ai.client.generativeai.type.Content

fun loadData(): MutableList<Content>{
    var retVal: MutableList<Content> = when {
        ChosenLanguage.chosenLanguage === "en" -> ChosenLanguage.chatHistoryEN
        ChosenLanguage.chosenLanguage === "es"-> ChosenLanguage.chatHistoryES
        ChosenLanguage.chosenLanguage === "de"-> ChosenLanguage.chatHistoryDE
        ChosenLanguage.chosenLanguage === "fr"-> ChosenLanguage.chatHistoryFR
        ChosenLanguage.chosenLanguage === "it"-> ChosenLanguage.chatHistoryIT
        ChosenLanguage.chosenLanguage === "jp"-> ChosenLanguage.chatHistoryJP
        ChosenLanguage.chosenLanguage === "se"-> ChosenLanguage.chatHistorySE
        ChosenLanguage.chosenLanguage === "kr"-> ChosenLanguage.chatHistoryKR
        ChosenLanguage.chosenLanguage === "cn"-> ChosenLanguage.chatHistoryCN
        else -> ChosenLanguage.chatHistoryEN
    }
    return retVal
}