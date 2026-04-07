package com.example.learn_kotlin.GENERIC

class invariant<T>(var data: T)

class covariant<out T>(val data: T) {
    fun data(): T {
        return data
    }

//      tidak boleh membuat function dengan input generic covariant
//    fun setData(param: T) {
//        data = param
//    }
}

class ContraVariant<in T> {
    fun setData(par: T) {
        println("Hello $par")
    }
}

fun main() {
    val InvariantString = invariant<String>("String")
//    val invariantAny: invariant<Any> = InvariantString // error
//    invariantAny.data = 100 // ini bisa karena Any adala parent dari Int, Long, Unit, String, dll.
    // row ke-7 error, karena sifat dari generic adalah invariant (suatu tipe data-
    // tidak bisa di substitusi ke tipe data lainnya--mau itu superclassnya(parent) atau subclassnya(child) karena dapat mengakibatkan konfik
    // tipe data)

    val CovariantString = covariant("joko")
    val CovariantAny: covariant<Any> = CovariantString
    println(CovariantAny.data())
    /* ini bisa karena memakai covariant, dan covariant bisa jika dari subclass(chilld) ke superclass(parent),
       dan tidak semua jenis class mendukung covariant, hanya Class generic yang menggunakan generic parameter type
       sebagai return type function */

    val contraVariant = ContraVariant<Any>()
    val data2 = contraVariant
    println(data2.setData("Akbar"))
    /* disini kebalikan dari covariant, kalau contravariant ini menjadikan T sebagai type paramter dari function didalam class generic */

}