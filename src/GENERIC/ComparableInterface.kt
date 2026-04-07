package com.example.learn_kotlin.GENERIC

class ComparableInterface(val Fruit: String,val quantity: Int) : Comparable<ComparableInterface> {
    override fun compareTo(other: ComparableInterface): Int {
        return quantity.compareTo(other.quantity)
    }
}

fun main() {
    val Fruit1 = ComparableInterface("Apple", 10)
    val Fruit2 = ComparableInterface("Apple", 10)

    println(Fruit1 > Fruit2)
    println(Fruit1 >= Fruit2)
    println(Fruit1 < Fruit2)
    println(Fruit1 <= Fruit2)
}