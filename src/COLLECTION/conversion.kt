package com.example.learn_kotlin.COLLECTION


fun main() {
    val array = arrayOf(1,2,3,4,5,7,8,9)
    val range = 1..100

    val arraytolist = array.toList()
    val arraytomutablelist = array.toMutableList()
    val arraytoset = array.toSet()
    val arraytomutableset = array.toMutableSet()
    val arraytosortedset = array.toSortedSet() // sortedset agar data berurutan

    // memakai range jug bisa, sebagai salah satu contoh :
    val rangetosortedset = range.toSortedSet()
}