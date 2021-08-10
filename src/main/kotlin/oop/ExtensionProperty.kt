package oop

import oop.data.Student

// setter or getter
//val Student.role: String = "Student"; error
val Student.nameUpper: String
    get() = this.name.uppercase()

fun main() {
    val angga = Student("Angga")
    println(angga.nameUpper)
}