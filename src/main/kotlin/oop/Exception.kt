package oop

class ValidationException(message: String?) : Throwable(message)

fun sayHelloFriend(name: String?) {
    if (name!!.isBlank()) {
        throw ValidationException("Name is blank")
    }
    println("Hello $name")
}

fun main() {
    try {
        sayHelloFriend("Angga")
        sayHelloFriend("")
        sayHelloFriend(null)
    } catch (e: ValidationException) {
        println("Error ${e.message}")
    } catch (e: NullPointerException) {
        println("Error ${e.message}")
    } finally {
        println("Please check your inputs")
    }
}