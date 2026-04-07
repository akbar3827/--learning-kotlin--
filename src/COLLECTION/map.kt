package com.example.learn_kotlin.COLLECTION

fun main() {
    val map1 = mapOf(
        Pair("a", "Akbar"),
        "b" to "bella",
        "c" to "cae in",
        "d" to "dutian",
        "e" to "erlang"
    )

    for ((K, V) in map1) {
        println("$K to $V")
    }

    val mutableMap = mutableMapOf<String, String>(
        Pair("a", "Akbar"),
        Pair("b", "bella"),
        Pair("c", "cae in"),
        Pair("d", "dutian"),
        Pair("e", "erlang")
    )
    mutableMap.put("b", "bella")
    mutableMap.get("e")
    mutableMap.getOrDefault("f", "fufufafa")

}