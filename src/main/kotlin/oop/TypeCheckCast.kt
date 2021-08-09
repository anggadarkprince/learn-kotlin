package oop

import oop.misc.printObject
import oop.misc.printObject2

fun main() {
    val myLaptop = Laptop("Asus")
    val myLaptop2 = Laptop("Dell")
    val myComputer = Computer("Desktop")

    printObject(myLaptop)
    printObject(myLaptop2)
    printObject(myComputer)

    printObject2(myLaptop)
    printObject2(myLaptop2)
    printObject2(myComputer)
}