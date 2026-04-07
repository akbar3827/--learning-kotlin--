package com.example.learn_kotlin.DATA

fun main() {

            // secondary constractor
            open class Person(P: String) {
                var name = P
                open var age: Int? = null
                constructor(P:String, Q: Int) : this(P) {
                    name = P
                    age = Q
                }
                open fun sayHelo() {
                    if (name != "" && age != null) {
                        return println("Hi! my name is $name, and I'am $age years old")
                    } else if (age == null) {
                        return println("Hi! my name is $name")
                    }
                }
            }
            Person("akbae", 17)
            class Person2 : Person {
                var firstName: String
                var middleName: String
                var lastName: String
                override var age: Int?

                constructor(M: String, N: String, O: String, P: Int) : super(M, P) {
                    firstName = M
                    middleName = N
                    lastName = O
                    age = P
                }
                override fun sayHelo() {
                    println("nagngong ${this.firstName} ${this.middleName} ${this.lastName}")
                    super.sayHelo()
                }
            }
            println(Person("kurkur").sayHelo())
            println(Person2("Moh.", "Akbar", "kurniawan", 17).sayHelo())
}

//fun Check(any: Any) {
//    when(any) {
//        is laptop -> println("name laptop : ${any.Name}")
//        is handphone -> println("name handphone : ${any.Name}")
//        else -> println(any)
//    }
//}

class Apapun(val name: String) { // class yang tidak mempunyai induk akan secara otomatis menjadi pewaris dari class Any
    override fun equals(other: Any?): Boolean { // ketika kita membandingkan sebuah object maka yang akan digunakan adalah fungsi equals
        return when(other) {                    // dan ini adalah membuat perbandingan yang secara manual agar menghindari perbandingan-
            is Apapun -> other.name == this.name// -object, tapi perbandingannya adalah property dari objectnya
            else -> false
        }
    }
    override fun hashCode(): Int {
        return name.hashCode()
    }
}

/// getter setter
class GetSet(name: String) {
    var name: String = name
        get() {
            return field
        } set(value) {
            if (value.isNotBlank()) {
                field = value.trim()
            } else {
                field
            }
        }
}


// inner outer class
class Boss(val boss: String) {
    inner class Employee(val name: String) {
        fun hi() {
            println("$name ${this@Boss.boss}")
        }
    }
}

// Compenion Object /////////////////////////////////
class Application {
    companion object Application { // menggunakan "companion" agar tidak memanggil Application.Application.toUpper()
        fun toUpper(name: String): String {
            return name.uppercase()
        }
    }
}
val applikasi = Application.toUpper("lsdkjalkjdkla")
////////////////////////////////////////////////////

// Delegation /////////////////////////
interface Base {
    fun sayHello(name: String)
}
class MyBase : Base {
    override fun sayHello(name: String) {
        println("hello $name")
    }
}
class BaseDelegation(val base: Base): Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }
}
fun MyBasee() {
    val base = MyBase()
    base.sayHello("kebar")

    val baseDelegate = BaseDelegation(base)
    baseDelegate.sayHello("akbar")
}
val mybase = MyBasee()
///////////////////////////////////////////