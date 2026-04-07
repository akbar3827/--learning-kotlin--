package com.example.learn_kotlin.GENERIC

class TypeProjection<T>(var data: T)

fun copyContainer(from: TypeProjection<in Any>, to: TypeProjection<out Any>) {
    from.data = to.data
}

fun main() {
    val data1 = TypeProjection<Any>("akbar")
    val data2 = TypeProjection("kurniawan")

    copyContainer(data1, data2)
}