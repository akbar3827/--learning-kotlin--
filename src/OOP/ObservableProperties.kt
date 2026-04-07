package com.example.learn_kotlin.OOP

import kotlin.properties.Delegates

class ObservableProperties(name: String) {
    var namee : String by Delegates.observable(name) {
        property, oldValue, newValue ->
        println("$property is changed from $oldValue to $newValue")
    }
}

fun main() {
    ObservableProperties("akbar")
    val barr = ObservableProperties("kurniawan")
    println(barr.namee)
}