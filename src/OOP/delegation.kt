package com.example.learn_kotlin.OOP

// delegation is passing implementation of the properties or functions to another object

interface Basee {
    fun sayHello(name: String)
}

class MyBase : Basee {
    override fun sayHello(name: String) {
        println(" hello Mr. $name S.T.")
    }
}

class delegation(val base: Basee) : Basee by base
//    override fun sayHello(name: String) {
//        base.sayHello(name)
//    }

fun main() {
    val bass = MyBase()
    bass.sayHello("akbar")

    val delegate = delegation(bass)
    delegate.sayHello("Mohammad Akbar kurniawan")
}