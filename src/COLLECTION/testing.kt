package COLLECTION

fun main() {
    val list = listOf("akbar", "kurniawan", "mohammad")
    val list1 = list.filter { it.length > 5 }
    val list2 = list.filterIndexed { index, string ->
        index % 2 == 0
    }
    val list3 = listOf(null, 1, "akbar", null, 2, "kurni")
    val list4 = list3.filterIsInstance<String>()
    val list5 = list3.filterNotNull()
    val (listMatch, listNotMatch) = list.partition { it.length > 5 } // memisahkan data yang match dan tidak
}