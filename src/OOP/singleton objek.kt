package com.example.learn_kotlin.OOP

object `singleton objek` {
    val nama: String = "akbar"

    fun sayHello(name: String) {
        println("hello $name, my name is $nama")
    }
}

fun main() {
    val myname = `singleton objek`.nama
    val yourname = `singleton objek`.sayHello("kurniadi")
}