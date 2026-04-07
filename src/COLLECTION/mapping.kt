package com.example.learn_kotlin.COLLECTION

fun main() {
    val listt = mutableListOf("1", "2", "3", "4", "5")
    val names = mutableListOf("akbar", "kurni", "17", "2008", "12", "akar", "akbar")
    val mapp = mutableMapOf(
        "1" to "akbar",
        "2" to "urniawan",
        "3" to "budiono"
    )

    val listt2 = listt.map { it.toInt()}
    val listt3 = listt.map { it.length }
    val names2 = names.mapNotNull {
        if (it.contains("abcd")) it else null
    }
    val mapp2 = mapp.map {
        if (it.key.toInt() % 2 == 0) {
            println(it.value)
        }
    }
    val mapp3 = mapp.mapKeys { it.key.toInt() * 10 }
    val mapp4 = mapp.mapValues { it.key.toInt() * 100 } // yang diubah adalah value nya meskipun menggunakan key
}