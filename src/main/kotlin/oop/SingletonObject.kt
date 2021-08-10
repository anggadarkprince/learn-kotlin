package oop

import oop.data.Utility

fun main() {
    val result = Utility.toUpper("Hello")
    println(result)
    println(Utility.name)
    println(Utility.ifEmpty(null, "No data available"))
}