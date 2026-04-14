package COLLECTION

fun main() {
    val sequence = ("lorem ipsum dorot afassd alfsfka adappp oasda apoasj fakfna").split(" ")
    val sequence2 = mutableListOf("null", 0)
//    val sequence3 = sequence // eager execution
//        .filter { sequence2.add(it); it.length > 5 }
//        .map { sequence2.add(it.uppercase()); it.uppercase() }
//        .take(5)
    val sequence4 = sequence.asSequence()  // lazy execution
        .filter { it.length >= 5; sequence2.add(it) }
        .map { sequence2.add(it.length); it.uppercase() }
        .take(3)
    println("length of words element sequence longer than 5 char")
    println(sequence2) // [null, 0]
    println(sequence) // [lorem, ipsum, dorot, afassd, alfsfka, adappp, oasda, apoasj, fakfna]
    println(sequence4.toList()) // [LOREM, IPSUM, DOROT]
    println(sequence2) // [null, 0, lorem, 5, ipsum, 5, dorot, 5]
    println(sequence2.size) // 8
}