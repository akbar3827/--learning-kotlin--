package COLLECTION

fun main() {
    val map = mapOf(
        "1" to "Akbar's a programer",
        "2" to "Lorem ipsum dorot"
    )
    for ((key, value) in map) {
        println("the value of $key is $value")
    }
    map.forEach { key, value ->
        println("$key:: $value")
    }
}