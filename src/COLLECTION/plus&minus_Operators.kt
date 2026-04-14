package COLLECTION

// in kotlin, there are extension function plus and minus for collection
/* first parameter is collection, and next parameter can using collection or element,
   and it will return new collection */

fun main() {
    val list1 = listOf("akbar", "abar")
    val list2 = list1 + "kurniadi"
    val list3 = list2 + listOf("akebar", "subar")
    val list4 = list3 - "akebar"
    val list5 = list3 - listOf("akbar", "abar")

    val map1 = mapOf("1" to "akbar kurniawan", "2" to "akbar abar")
    val map2 = map1 - ("1" to "akbar kurniawan")
    val map3 = map1 - "2"
    println(list1)
    println(list2)
    println(list3)
    println(list4)
    println(list5)
    println(map1)
    println(map2)
    println(map3)
}