package com.example.learn_kotlin.OOP

// Polymorpphism adalah kemampuan berubah ubah bentuk objek dari sautu class ke class pewaris

open class Polymorphism(val name: String) {
    fun sayHello() {
        println("my name is $name")
    }
}

class LONGGG(val namaa: String,
           val nomor: String): Polymorphism(namaa) {
    fun showNumber() {
        println("my number is $nomor")
    }
}

fun main() {
    var nama = Polymorphism("akbar")
    nama.sayHello()

    nama = LONGGG("akbar", "089602835542")
}