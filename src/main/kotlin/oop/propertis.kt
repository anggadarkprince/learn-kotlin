package oop

import oop.data.Person

fun main() {
    val angga = Person()
    angga.firstName = "Angga"
    angga.lastName = "Ari"
    angga.age = 28

    println(angga.firstName)

    val ari = Person()
    ari.firstName = "Ari"

    println(ari.firstName + " " + ari.age)
}