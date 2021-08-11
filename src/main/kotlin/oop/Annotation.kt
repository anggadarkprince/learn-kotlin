package oop

import oop.data.MyApplication

fun main() {
    val application = MyApplication("HelloWorld", 1)
    println(application.info())
    // see Reflection for example read annotation value
}