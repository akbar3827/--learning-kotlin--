package com.example.learn_kotlin.OOP

interface Action {
    fun Action(): Unit
    // test
}

fun fireAction(actio : Action) {
    actio.Action()
}

fun Main() {
    fireAction(object : Action {
        override fun Action() = println("Action one")
    })
    fireAction(object : Action {
        override fun Action() = println("Action two")
    })
}