package com.example.learn_kotlin.GENERIC

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


class ReadWritePropertyyy(var data: String) : ReadWriteProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("get property with value $data")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("set property with value from $data to $value")
        data = value.uppercase()
    }
}

class Person(param: String) {
    var name: String by ReadWritePropertyyy(param)
}

fun main() {
    val person = Person("akbar")
    println(person)
    person.name = "kuriadi"
    println(person)
    println(person)
}