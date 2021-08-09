package oop

// by default all class inherit from any class
class Laptop(val brand: String): Any()
class Computer(val type: String)

fun main() {
    val myLaptop = Laptop("Asus")
    val myLaptop2 = Laptop("Dell")
    val myComputer = Computer("Desktop")

    println("equals(): ${myLaptop.equals(myComputer)}")
    println("equals(): ${myLaptop.equals(myLaptop2)}")
    println("hasCode(): ${myLaptop.hashCode()}")
    println("toString(): ${myLaptop.toString()}")
}