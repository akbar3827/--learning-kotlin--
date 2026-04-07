package com.example.learn_kotlin.GENERIC

class GenericExtentionFunc<T>(var age: T)

fun GenericExtentionFunc<Int>.commpare(newAge: Int)  {
    if (newAge > age) {
        age = newAge
    }
}

fun main() {
    val myAge = GenericExtentionFunc(17)
    myAge.commpare(15)
    println(myAge.age)

    val myName = GenericExtentionFunc("akbar")
//    myName.compare() // error (karena func commpare tidak ada di class generic String)
}