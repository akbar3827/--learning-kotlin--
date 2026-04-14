package COLLECTION

fun main() {
    val list1 = listOf("a", "b", "c", "akbar", "kurniawn", "moh")
    val listOfMap = mutableListOf<Map<String, String>>()
    println(list1.chunked(3)) // [[a, b, c], [akbar, kurniawn, moh]]
    list1.chunked(6) {
        for (i in 0..5) {
            if (it[i] != "a" || it[i] != "b" || it[i] != "c") {
                listOfMap.add(mapOf("${i - 2}" to it[i]))
            }
        }
    }
    println(listOfMap) // [{1=akbar}, {2=kurniawn}, {3=moh}]
}