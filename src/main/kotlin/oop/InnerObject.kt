package oop

import oop.data.Application

fun main() {
    val application = Application("MyApp")
    //application.Helper.version("1.0") // cannot access inner object from parent

    val version = Application.Helper.version("1.0")
    println(version)
}