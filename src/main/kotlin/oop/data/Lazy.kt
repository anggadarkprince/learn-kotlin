package oop.data

class Lazy {
    // initialized when data accessed
    val name: String by lazy {
        println("Lazy call")
        "Angga"
    }
}