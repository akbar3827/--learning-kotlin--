package com.example.learn_kotlin.COLLECTION

fun <T> DisplayCollection(collection: Collection<T>) {
    for (item in collection) {
        println(item)
    }
}
fun <T> DisplayMutableCollection(collection: MutableCollection<T>) {
    for (item in collection) {
        println(item)
    }
}

fun main() {
    DisplayCollection(listOf("k", "u", "r"))
    DisplayCollection(setOf("n", "i", "a"))
//    DisplayCollection(Pair("1", "akbar")) // ERROR karena bukan turunan dari Collection
    DisplayCollection(mapOf("1" to "wan", "2" to "kruniadi").entries)
//    DisplayCollection(mapOf("1" to  "kruniawan")) // Error karena bukan turunan dari Collection
    DisplayCollection(mutableListOf(1, 2, 4, 5)) // tidak Error karena mutableCollection adalah turunan dari collection

    DisplayMutableCollection(mutableListOf("k", "u", "r"))
    DisplayMutableCollection(mutableSetOf("k", "u", "r"))
    DisplayMutableCollection(mutableMapOf("1" to "kurniadi").entries)
//    DisplayMutableCollection(mutableMapOf("1" to "kurniadi")) // bukan turunan dari collection/mutable collection
}