package oop

import oop.data.Minus
import oop.data.Operation
import oop.data.Plus
import kotlin.math.min

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when (operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
    }
}

fun main() {
    //val operation = Operation("Plus") // error because the class is sealed, cannot be instantiated
    val plus = Plus()
    val minus = Minus()

    println(operation(2, 3, plus))
    println(operation(2, 3, minus))
}