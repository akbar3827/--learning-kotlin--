package com.example.learn_kotlin.COLLECTION

import java.lang.StringBuilder

fun main() {
    val list = listOf("akbar", "kabar", "kurni")

    val list2 = list.joinToString("  ", "|  ", "  |")
    val list3 = list.joinToString("  ", "|  ", "  |") { "item $it" }
    val appendable = StringBuilder()
    list.joinTo(appendable, "  ", "|  ", "  |   ")
    list.joinTo(appendable, "  ", ">>", "<<")
    val stringg3 = appendable.toString()
    println(stringg3)
}