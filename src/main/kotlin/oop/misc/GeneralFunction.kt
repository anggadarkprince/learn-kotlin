package oop.misc

import oop.Computer
import oop.Laptop

fun printObject(any: Any) {
    if (any is Laptop) {
        // auto smart-cast any to Laptop
        println("Laptop ${any.brand}")
    } else if (any is Computer) {
        // auto smart-cast any to Computer
        println("Computer ${any.type}")
    } else {
        println(any)
    }
}

fun printObject2(any: Any) {
    when (any) {
        is Laptop -> println("Laptop ${any.brand}")
        is Computer -> println("Computer ${any.type}")
        else -> println(any)
    }
}