package oop

import oop.data.Customer
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

fun main() {
    val customer = Customer("Angga", "premium", 50000)
    val customerReflection = customer::class

    val constructors = customerReflection.constructors
    val functions = customerReflection.memberFunctions
    val parameters = customerReflection.memberProperties
    val annotations = customerReflection.annotations

    println(constructors)
    println(functions)
    println(parameters)
    println(annotations)
}