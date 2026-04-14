package COLLECTION

fun main() {
    // retrive by condition
    val list = listOf("aa", "bb", "cc")
    println(list.first())
    println(list.last())
    println(list.elementAt(1))
    println(list.elementAtOrNull(10))
    println(list.elementAtOrElse(10) { "" })

    // retrive by condition
    val list2 = (1..20).toList()
    println(list2.first { it > 10 }) // 10
    println(list2.last { it > 10 }) // 20
    println(list2.firstOrNull { it > 50}) // null
    println(list2.find { it > 50 }) // null
    println(list2.lastOrNull { it > 50 }) // null
    println(list2.findLast { it > 50 }) // null

    // retrive by rendom
    println(list2.random()) // random among 1 until 20
}