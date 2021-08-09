package oop.data

abstract class Animal {
    abstract val name: String
    abstract fun run(): Unit
}

// or Cat(override val name: String = "Cat")
class Cat : Animal() {
    override val name: String = "Cat"

    override fun run() {
        println("Cat run!")
    }
}