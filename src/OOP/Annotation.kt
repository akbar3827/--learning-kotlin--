package com.example.learn_kotlin.OOP


@Target(AnnotationTarget.CLASS) // hanya bisa ditambahkan diclass?
@Retention(AnnotationRetention.RUNTIME) // hasilnya masuk ke binary dan ikut kecomsjs ke binary, dan bisa diliat oleh refleksion
@MustBeDocumented
annotation class Fancy(val author: String) // annotation class tidak bisa memiliki member(property, function, constructor, dll)


@Fancy(author = "Akbar")
class Annotation(val nama: String, val version: Int) {

    fun info() = "application $nama-$version"
}

fun main() {
    val pp = Annotation("kurni", 1)
    println(pp)
}