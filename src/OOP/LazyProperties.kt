package com.example.learn_kotlin.OOP

class LazyProperties {
    val name: String by lazy {
        println("name is created")
        "barr"
    }
}

fun main() {
    val nama = LazyProperties().name
    println(nama)
}