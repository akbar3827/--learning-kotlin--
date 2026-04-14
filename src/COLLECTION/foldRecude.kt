package COLLECTION

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 2, 5, 3, 4, 8, 9, 10)
    println(list.reduce { acc, i ->
        if ( i % 2 == 0) i else 0 // will keep up iteration until found the highest value
    })
    println(list.foldRight(0) { acc, i ->
        acc + i // the result is 55
    })

    // list spesific operation
    println(list.getOrNull(10))
    println(list.getOrElse(11) {"tidak ada" })
    println(list.subList(1, 3))

    val sortedList = list.sorted()
    println(sortedList.binarySearch(5))
    println(sortedList.binarySearch(4))
    println(sortedList.binarySearch(1))

    println(list.size -1)
    println(list.indexOf(5))
    println(list.lastIndexOf(5))
    println(list.indexOfFirst { it % 2 == 0 })
    println(list.indexOfLast { it % 2 == 0 })

    // set spesific operation
    val set1 = (1..20).toSet()
    val set2 = (12..22).toSet()

    println(set2 union set1) // the return's combine of set2 and set1
    println(set1 intersect set2 ) // the return's intersection of set1 and set2
    println(set1 subtract set2) // the return's elements which exist in set1 and not exist in set2
}