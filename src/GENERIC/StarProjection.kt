package com.example.learn_kotlin.GENERIC

// star projectio adalah simbol * yang merepresentasikan bahwa kita tidak membutuhkan tipe dari generic object tersebut
fun StarProjection(array: Array<*>) {
    println("total array are ${array.size}")
}

fun main() {
    StarProjection(arrayOf(1,22,3,4,5,55,23323232,23,23,4234234))
    StarProjection(arrayOf("", "A","k", "b", "a", "r", "."))
}