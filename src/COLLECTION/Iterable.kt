package com.example.learn_kotlin.COLLECTION

fun <T> DisplayIterable(iterable: Iterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) println(iterator)
}
fun <T> DisplayMutableIterable(iterable: MutableIterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() == "akbar") {
            iterator.remove()
        } else {
            println(iterator)
        }
    }
}

fun main() {
    val names = listOf("akbar", "kurni", "sibar", "kurniawan", "akbar, 'Akbar")
    DisplayIterable(names)
}