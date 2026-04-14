    package com.example.learn_kotlin.COLLECTION

fun main() {
    val list: List<String> = listOf("Moh.", "Akbar", "kurniawan")
    println(list[1])
    println(list.isEmpty())
    println(list.indexOf("kurniawan"))
    println(list.contains("Moh"))

    val mutablelist: MutableList<String> = mutableListOf()

    mutablelist.add("kurniadi")
    mutablelist.add("Akbar")
    mutablelist.set(0, "Moh.")

    val set: Set<String> = setOf("kurni", "dd", "akbar", "abell", "dd", "abel")
    println(set.size)
    val mutableSet: MutableSet<String> = mutableSetOf("akbar", "akbar", "abar", "akbar", "abel")
    mutableSet.add("abel")
    println(mutableSet.size)
    println(set union mutableSet) // menggabungkan seluruh data tanpa duplicate

    /* string yang sama tidak akan di-set ke mutableSet karena data yang duplicate akan direject
    ini cocok untuk data yang unik (tidak sama) */
}