package com.example.learn_kotlin.GENERIC

import com.example.learn_kotlin.OOP.ObservableProperties
import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservablePropertyy<T>(data: T) : ObservableProperty<T>(data) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("before change ${property.name} from $oldValue to $newValue")
        return true
    }
    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("after change ${property.name} from $oldValue to $newValue")
    }
}

class Car(brand: String, year: Int) {
    var brand: String by LogObservablePropertyy(brand)
    var year: Int by LogObservablePropertyy(year)
    // bisa juga menggunakan yang lebih simple lagi yaitu menggunakan delegates
    var owner : String by Delegates.notNull()
    var ageOwner: Int by Delegates.vetoable(15) {property, oldValue, newValue ->
        newValue >=oldValue
    }
    var other: String by Delegates.observable("hallo") {property, oldValue, newValue ->
        println("changed : $oldValue to $newValue")
    }
}

fun main() {
    val car = Car("Toyota", 2024)
    println(car.brand)
    println(car.year)

    car.brand = "Wuling"
    println(car.brand)
    car.year = 2026
    println(car.year)
    car.ageOwner = 13
    println(car.ageOwner)
    car.other = "haii"
    println(car.other)
}