package com.example.learn_kotlin.COLLECTION
fun <T> displayListIterator(iterator: ListIterator<T>) {
    println("Display Next")
    while (iterator.hasNext()) {
        println(iterator.next())
    }
    println("Display Previous")
    while (iterator.hasPrevious()) {
        println(iterator.next())
    }
}

fun displayMutableListIterator(iterator: MutableListIterator<Int>, add: Int) {
    while (iterator.hasNext()) {
        if (!iterator.hasNext()) {
            iterator.add(add)
        } else {
            println(iterator.next())
        }
    }
    while (iterator.hasPrevious()) {
        val value = iterator.next()
        if (value % 2 == 1) {
            iterator.remove()
        }
        else {
            println(iterator.next())
        }
    }
}

fun main() {
    val range = 1..1000
    println(displayListIterator(listOf("aa", "bb", "cc", "dd").listIterator()))
    println(displayMutableListIterator(range.toMutableList().listIterator(), 10))
}