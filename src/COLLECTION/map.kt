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

    // Map Spesific Operation
    println(map1.getOrElse("z") { "there is no value for z" })
    println(map1.getValue("e"))
    println(map1.filter { it.key != "a" })
    println(map1.filterKeys { it != "a" })
    println(map1.filterValues { it != "erlang" })
}