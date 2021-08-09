package oop

import oop.data.Rectangle
import oop.data.Shape
import oop.data.Triangle

fun main() {
    val shape = Shape()
    println(shape.corner)

    val rectangle = Rectangle()
    println(rectangle.corner)

    val triangle = Triangle()
    println(triangle.corner)
}