package com.example.learn_kotlin.COLLECTION

class Member(val name: String, val hobbies: List<String>)

fun main() {
    val list = listOf(
        listOf("a","b"),
        listOf("1","2")
    )
    val list1 = listOf(
        Member("akbar", listOf("coding", "reading")),
        Member("kurni", listOf("gaming", "sleeping"))
    )
    val list2 = list.flatten() // semua data dari sublist akan digabung menjadi satu dari kanan ke kiri
    val list3 = list1.flatMap { it.hobbies } // mengambil hoobies dan diflate hobbies tersebut
}