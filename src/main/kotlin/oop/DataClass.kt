package oop

import oop.data.Product

fun main() {
    val mouse = Product("Mouse", 10000, "Electronic")
    val mouse2 = Product("Mouse", 10000, "Electronic")
    val keyboard = Product("Keyboard", 15000, "Electronic")
    val keyboard2 = keyboard.copy() // auto copy all attribute
    val keyboard3 = keyboard.copy(price = 20_000) // modify properties

    println(mouse) // print attribute (not the hash or memory location)
    println(mouse2)
    println(mouse.equals(mouse2)) // true because equal function is automatic check the attributes
    println(mouse.equals(keyboard))
    println(keyboard2)
    println(keyboard3)
}