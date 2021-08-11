package generic

class Contravariant<in T> {
    fun sayHello(name: T) {
        return println("Hello $name")
    }
}

fun main() {
    // contravariant: substitute supertype (parent) with subtype (child)
    // function only allow input generic type
    val data1: Contravariant<Any> = Contravariant()
    val data2: Contravariant<String> = data1
    data2.sayHello("Angga")
}