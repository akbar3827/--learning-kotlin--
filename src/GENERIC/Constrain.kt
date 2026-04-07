package com.example.learn_kotlin.GENERIC

interface CanSayHello {
    fun sayHello(name: String)
}
open class Constrain
class Employee : Constrain()
class VicePresident : Constrain(), CanSayHello {
    override fun sayHello(name: String) {
        println("hello $name")
    }
}
class Company<T : Constrain>(val employee: T)
class Companies<T>(val employee: T) where T: Constrain, T : CanSayHello

fun main() {
    val data1 = Company(Constrain())
    val data2 = Company(Employee())
    val data3 = Company(VicePresident())

    val data4 = Companies(VicePresident())
    // val data5 = Companies(Employee()) // error karena Employee() tidak bisa melakukan CanSayHello
}