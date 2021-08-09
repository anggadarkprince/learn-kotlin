package oop

import oop.data.Person

fun main() {
    val person = Person()
    person.firstName = "Angga"
    person.lastName = "Ari"

    // function invocation
    person.sayHello("Budi")
    person.run()
    println(person.getFullName())

    // function overloading
    person.sayHello("Budi", "Ardiani") // this keyword inside this function
    person.sayHello(5)

    // function overriding
    // see: Inheritance.kt
}