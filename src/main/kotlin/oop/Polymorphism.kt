package oop

import oop.data.Employee
import oop.data.Manager
import oop.data.VicePresident

fun main() {
    val angga = Employee("Angga")
    angga.sayHello("Ari")

    val ari = Manager("Ari")
    ari.sayHello("Keenan")

    val wijaya = VicePresident("Wijaya")
    wijaya.sayHello("Evander")
}