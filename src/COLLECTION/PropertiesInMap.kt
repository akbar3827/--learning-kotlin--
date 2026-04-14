package COLLECTION

class PropertiesInMap(map: Map<String, String>) {
    val names: String by map
    val version: String by map
    // name of variable must be same with key of map
}

fun main() {
    val map = PropertiesInMap(mapOf(
        "names" to "lorem ipsum dorot",
        "version" to "akbar kurniawan"
    ))
    println(map.names)
    println(map.version)
}