package com.example.learn_kotlin.COLLECTION

fun main() {
    val list1 = mutableListOf("moh.", "akbar", "kurniawan")
    val list2 = mutableListOf("programmer", "generasi", "Z")
    val list3 = listOf(
        "1" to "akbar",
        "2" to "kurniawan",
        "3" to "selembar"
    )

    val list4: List<Pair<String, String>> = list1.zip(list2) // kalau tidak menggunakan lambda akan menjadi Pair
    val list5: List<String> = list1.zip(list2) { a, b ->
        a + b // kalau sama lambda hasillya bukan Pair
    }
    val list6: Pair<List<String>, List<String>> = list3.unzip() // akan memisahkan data Pair menjadi 2 List
    println(list6)
}