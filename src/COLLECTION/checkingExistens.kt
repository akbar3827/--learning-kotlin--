package COLLECTION

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbers.contains(5)) // true
    println(numbers.containsAll(listOf(1,2,5,11))) // false
    println(numbers.isEmpty())
    println(numbers.isNotEmpty())
}