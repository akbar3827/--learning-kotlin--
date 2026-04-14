package COLLECTION

fun main() {
    val list1 = ('a'..'z').toList()
    val list2 = list1.take(10)
    val list3 = list1.takeLast(10)
    val list4 = list1.takeWhile { it < 'd' }
    val list5 = list1.takeLastWhile { it <= 'f' }
    val list6 = list1.drop(3)
    val list7 = list1.dropLast(10)
    val list8 = list1.dropWhile { it >= 'w'}
    val list9 = list1.dropLastWhile { it >= 'g' }

    println(list1)
    println(list2)
    println(list3)
    println(list4)
    println(list5)
    println(list6)
    println(list7)
    println(list8)
    println(list9)
}