package com.example.lingogemi

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Chat : Screen("chat")
    object Lang : Screen("lang")
}