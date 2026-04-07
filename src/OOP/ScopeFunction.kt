package com.example.learn_kotlin.OOP

// kotlin have standart library which contain functions that can be used to executing an object-
//  easier that utilise lambda expression
// the lambda consist of let, run, apply, also

fun main() {
    var myFood: ArrayList<String>
    val product = CreateProductRequest("1", "ndog", 2000)
    product.let {
        myFood = arrayListOf<String>(it.name)
    }
    val product2 = CreateProductRequest("2", "intermie", 3000)
    product2.run {
        myFood.set(1, this.name)
    }
    println(myFood)

    val product3 = CreateProductRequest("3", "beras 5kg", 69000)
    product3.apply {
        println(" the price of product ${this.name} is ${this.price}")
    }
    product3.also {
        println(" the price of product ${it.name} is ${it.price}")
    }
}