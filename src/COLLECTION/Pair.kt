package com.example.learn_kotlin.COLLECTION

fun main() {
    val pair1 = Pair<String, String>("A", "B")
    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<String, String> = "eko" to "kurniawan"
    println(pair2.first)
    println(pair2.second)
}