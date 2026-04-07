package com.example.learn_kotlin.OOP

class ValidationException(message: String) : Throwable(message)

fun Exception(name: String) {
    if(name.isBlank()) {
        throw ValidationException("name must be enter in")
    } else {
        println(name)
    }
}

fun main() {
    try {
        println("Loead..")
        Exception("urniadni")
        Exception("")
        Exception("akbrrrrr")
    } catch (error : ValidationException) {
        println("error")
        println("terjadi error ${error.message}")
    }catch (error : ValidationException) {
        println("terjadi error ${error.message}")
        println("error")
    }catch (error : ValidationException) {
        println("terjadi error ${error.message}")
        println("error")
    } finally {
        println("Loading is success")
    }
}