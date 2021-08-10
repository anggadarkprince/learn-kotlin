package oop

import oop.data.Base
import oop.data.MyBase

// automatic delegate all object (properties or function) to whatever "base" passed
class Delegate(val base: Base) : Base by base

// override delegation
class Delegate2(val base: Base) : Base by base {
    override fun sayHello(name: String) {
        println("Delegate hello $name")
    }
}

fun main() {
    val myBase = MyBase()
    val delegate = Delegate(myBase)
    delegate.sayHello("Angga")

    val delegate2 = Delegate2(myBase)
    delegate2.sayHello("Keenan")
}