package oop

import oop.data.Student
import oop.data.Teacher

typealias Member = Student
typealias Mentor = Teacher
typealias StringProvider = () -> String

fun sayHello(value: StringProvider) {
    println("Hello ${value()}")
}

fun sayHello(from: String, value: StringProvider) {
    println("Hello ${value()} from $from")
}

fun main() {
    val member = Member("angga")
    val mentor = Mentor()
    mentor.name = "Keenan"

    sayHello { "Angga" }
    sayHello("Keenan") {
        member.name
    }
}