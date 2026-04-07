package com.example.learn_kotlin.COLLECTION

fun main() {
    val list = listOf("moh", "akbar", "kurniawn")
    val map1 = list.associate { Pair(it.length.toString(), it) }
    val map3 = list.associateWith { it.uppercase() } // associateWith membuat value nya
    val map2 = list.associateBy { it.length.toString() } // associateBy membuat Key nya
}