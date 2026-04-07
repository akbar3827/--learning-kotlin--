package com.example.learn_kotlin.OOP

enum class enum(val descripton: String) {
    MALE("MALE"), FEMALE("FEMALE");

    fun printDescription() {
        println(descripton)
    }
}

fun main() {
    val man = enum.MALE
    val waman = enum.FEMALE
    val allGenders = enum.entries
}