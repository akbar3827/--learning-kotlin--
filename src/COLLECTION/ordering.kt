package COLLECTION

data class Person(val name: String, val age: Int)

fun main() {
    val number = listOf(1,3,6,3,6,2,4,23,345,345,346,35,331,35,34,5,534,23,3425,43,45,34,)
    println(number.sorted())
    println(number.sortedDescending())

    // custom order
    val listPerson = listOf(Person("Alice", 29), Person("Bob", 31), Person("Charlie", 31))
    println(listPerson.sortedBy { it.name })
    println(listPerson.sortedBy { it.age })
    println(listPerson.sortedByDescending { it.name })
    println(listPerson.sortedByDescending { it.age })
    println(listPerson.sortedWith(Comparator<Person>{ a, b ->
        a.name.compareTo(b.name) }))
    println(listPerson.sortedWith { person1, person2 ->
        person2.age.compareTo(person1.age)
    })

    // ordering reverse
    val listNames = mutableListOf("Alice", "Bob", "Charlie")
    val listReverse = listNames.reversed()
    val listAsReserve = listNames.asReversed()
    listNames.add("Steven")
    println(listReverse)
    println(listAsReserve)

    // ordering random
    println(listNames)
    println(number.shuffled())
    println(number.shuffled())
    println(number.shuffled())
}