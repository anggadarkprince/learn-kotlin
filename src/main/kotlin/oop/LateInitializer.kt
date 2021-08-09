package oop

import oop.data.Television

fun main() {
    val television = Television()
    //println(television.brand) // error

    television.initTelevision()
    println(television.brand) // initialized
}