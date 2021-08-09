package oop

import oop.data.Car
import oop.data.Person

fun main() {
    val person = Person()
    person.firstName = "angga"
    println(person)

    val car = Car("Toyota", "Camry", 2021)
    println(car)
}