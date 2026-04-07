package com.example.learn_kotlin.COLLECTION

fun main() {
    val listt = mutableListOf("moh.", "akbar", "kurniawan")
    listt.forEach { println(it) }
    listt.forEachIndexed { index, string ->
        println("$index : $string")
    }
}