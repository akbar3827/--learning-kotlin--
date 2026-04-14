package COLLECTION

/* slice is an operator that used to taking some element
that exist in collection which proper on range parameter */

fun main() {
    val list1 = (0..100).toList()
    val list2 = list1.slice(0..20)
    val list3 = list1.slice(0..50 step 5)
    val list4 = list1.slice(0..100 step 9)
    val list5 = list1.slice(100 downTo 0 step 7)

    println(list1)
    println(list2)
    println(list3)
    println(list4)
    println(list5)
}