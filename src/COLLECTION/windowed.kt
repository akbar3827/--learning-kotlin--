package COLLECTION

/* windowed is a operation to get all of possibility of collection precise on range which have specify */

fun main() {
    val list1 = listOf(1,2,3,4,5)
    println(list1.windowed(2,2,true)) // [[1, 2], [3, 4], [5]]
    println(list1.windowed(2,1,false)) // [[1, 2], [2, 3], [3, 4], [4, 5]]
    println(list1.windowed(2,1,true) {it.size}) // [2, 2, 2, 2, 1]
}