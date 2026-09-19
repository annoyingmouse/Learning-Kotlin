package com.example.learningkotlin

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform