package oop

import oop.data.Manager
import oop.data.VicePresident

fun main() {
    val manager = Manager("Angga")
    manager.sayHello("Budi") // overridden invocation
    manager.sendReport()

    val vp = VicePresident("Angga")
    vp.sayHello("Ari")
}