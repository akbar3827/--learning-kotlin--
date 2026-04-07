package com.example.learn_kotlin.GENERIC

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LogReadOnlyProperty(val data: String) : ReadOnlyProperty<Any, String> {
    var counter = 0
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access Property ${property.name} with value $data")
        counter++
        return data.uppercase() + counter
    }
}

class ReadOnlyPropertyy(param: String) {
    val name: String by LogReadOnlyProperty(param)
}


fun main() {
    val name = ReadOnlyPropertyy("akbarrrr")
    println(name.name)
    println(name.name)
    println(name.name)
    println(name.name)
}