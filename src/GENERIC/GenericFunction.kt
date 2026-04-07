package com.example.learn_kotlin.GENERIC

class GenericFunction<T>(val name: T) {

    fun <I> sayHello(secondName: I) {
        println("hello $name, my name is $secondName")
    }
}

fun main() {
    val name = GenericFunction<String>("joko")
    name.sayHello("akbar")
    println(name)
}