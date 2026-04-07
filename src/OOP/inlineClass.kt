package com.example.learn_kotlin.OOP

// the usefullness of inline class that is to reduce konsumsi memory, and must there is one properties in that class

inline class inlineClass(val nama: String) {
    fun toUpper(): String = nama.uppercase()
}

fun main() {
    inlineClass("akbar").toUpper()
}