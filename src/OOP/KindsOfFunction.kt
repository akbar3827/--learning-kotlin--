package com.example.learn_kotlin.OOP


fun main() {

        // Extension function  ////////
        fun String.Hello(): String {
            return "Hello $this"
        }

        val nama = "akbar"
        println(nama.Hello())
        ////////////////////////////

        // tailrecursive function //////////////////////////////////////
        tailrec fun RecursiveFunction(v: Int, t: Int = 1): Int {
            return when(v) {
                1 -> t
                else -> RecursiveFunction(v -1, t * v)
            }
        }
        val recur = RecursiveFunction(10)
        println(recur)
        //////////////////////////////////////////////////////////////////

        // anonymous funtion /////////////////////////
        val anonymousFunction = fun(value: String): Any {
            if (value == "") {
                return "Name is required"
            } else {
                return value.length
            }
        }
        val hello = HEllo("", anonymousFunction)
        println(hello)
        /////////////////////////////////////////////////

        // method reference /////////////////////////////////////
        fun ToUpper(v: String): String = v.uppercase()
        val toUpperCase: (String) -> String = ::ToUpper

        println(toUpperCase("akbar kurniawan"))
        /////////////////////////////////////////////////////////

        // lambda Expression //////////////////////////////////////////////////////////
        val lambdaExpression: (String, Int) -> Unit = { name: String, age: Int ->
            val result = "Hi! my name is $name, and i'm $age years old"
            result
        }
        println(lambdaExpression("akbar", 17))
        //lambda ke-2 //////////////////////////////////////////////
        val lambdaExpression2: (String) -> String = {
            "hello $it"
        }
        println(lambdaExpression2("akbar"))
        ////////////////////////////////////////////////////////////////////////////////

        // factiorial recusive function ///////////////////////////////////////////////
        fun factorialRecursiveFunction(value: Int): Int {
            return when (value) {
                1 -> 1
                else -> value * factorialRecursiveFunction(value - 1) // memanggil functionnya sendiri
            }
        }
        val factorialRecursive = factorialRecursiveFunction(10)
        println(factorialRecursive)
        /////////////////////////////////////////////////////////////////////////////

        // function infix notation  ///////////////////////////////////////////////////////////////
        infix fun Int.downTo(value: Int): IntProgression { // DownTo adalah nama dari function
            return IntProgression.fromClosedRange(this, value, -1)
        }
        val hitungMundur = 100 downTo 0

        println(hitungMundur)
        ///////////////////////////////////////////////////////////////////////////////////////////
    }

    //Higher-Order Function + inline  //////////////////////////////////////////////
    inline fun HEllo(v: String, Transform: (String) -> Any): String {
        val transformName = Transform(v)
        return "Hello $v, total karakter nama anda adalah : $transformName"
    }

    //////////////////////////////////////////////////////////////////////

    // label ////////////////////////////
    fun label() {
        loopI@ for (i in 1..5) {
            loopJ@ for (j in 1..5) {
                println("$i x $j = ${i * j}")
                if (j == 3) {
                    continue@loopI // manfaat dari label adalah bisa mengakses label diatasnya "labelJ"
                }
            }
        }
    }

