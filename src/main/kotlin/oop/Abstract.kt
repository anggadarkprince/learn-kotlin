package oop

import oop.data.Cat

abstract class Location(val name: String)
class City(name: String): Location(name)

fun main() {
    // error cannot initialize abstract class
    //val location = Location("Surabaya")
    val city = City("Gresik")
    println(city)

    // access property and function
    val cat = Cat()
    cat.run()
}