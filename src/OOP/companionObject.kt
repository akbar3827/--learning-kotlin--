package com.example.learn_kotlin.OOP

class companionObject {
    companion object {
        fun hello(name: String) {
            println("hello $name")
        }
    }
}

fun main() {
    companionObject.hello("akbar")
}