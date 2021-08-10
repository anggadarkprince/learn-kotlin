package oop.data

class Lazy {
    val name: String by lazy {
        println("Lazy call")
        "Angga"
    }
}