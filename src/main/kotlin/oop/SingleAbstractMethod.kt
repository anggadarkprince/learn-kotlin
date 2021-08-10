package oop

// SAM (single abstract method is interface that only have single function)
@FunctionalInterface
fun interface Action {
    fun run()
}

fun runAction(a: Action) = a.run()

fun main() {
    runAction(object : Action {
        override fun run() {
            println("Hello, Kotlin 1.4!")
        }

    })

    // lambda version
    runAction {
        println("Hello, Kotlin 1.4!")
    }
}