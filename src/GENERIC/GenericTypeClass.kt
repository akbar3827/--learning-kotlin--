package com.example.learn_kotlin.GENERIC

class GenericTypeClass<T, N, E>(val firstData: T,
                                val secondData: N,
                                val thirdData: E) {
    fun getData(): Array<Any?> = arrayOf(firstData, secondData, thirdData)

    fun printData() {
        println("Data is $firstData")
        println("Data is $secondData")
        println("Data is $thirdData")
    }
}


fun main() {
    /*
    * E -> Element (biasanya digunakan di collection atau struktur data
    * K -> Key
    * N -> Number
    * T -> Type
    * V -> Value
    * S,U,V, etc. - 2nd,3rd, 4th types
    */

    val myDataString: GenericTypeClass<String, Int, Long> =
        GenericTypeClass("akbar", 17, 2008)
    println("my name is ${myDataString.firstData}, age ${myDataString.secondData}, and i born in ${myDataString.thirdData}")

    val myDataInt: GenericTypeClass<Int, Long, String> =
        GenericTypeClass(1, 2500, "indome")
    println("i bought ${myDataInt.firstData} ${myDataInt.thirdData} and the price is ${myDataInt.secondData}")
}