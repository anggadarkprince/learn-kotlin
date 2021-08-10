package oop

import oop.data.Student

// cannot access private or protected objects (properties or functions)
fun Student.sayGoodBye(name: String) {
    println("Goodbye $name, my name is ${this.name}")
}

// nullable extension function
fun Student?.makeGroup(name: String) {
    if (this != null) {
        println("Group $name with ${this.name}")
    }
}

fun main() {
    val angga = Student("Angga")
    angga.sayGoodBye("Ari")

    val keenan: Student? = null
    keenan?.sayGoodBye("Miya")
}