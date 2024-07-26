package com.krcoding.instagramui

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform