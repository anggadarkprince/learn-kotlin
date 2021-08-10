package oop

data class Friend(val name: String)

// null check before access
fun sayHello(friend: Friend?) {
    if (friend != null) {
        println("Hello ${friend.name}}")
    }
}

// safe call of property or function
fun sayHello2(friend: Friend?) {
    println("Hello ${friend?.name}}")
}

// !! operator (force accessing the value) can cause NPE (null pointer exception)
fun sayHello3(friend: Friend?) {
    println("Hello ${friend!!.name}}")
}

fun main() {
    // elvis operator
    var b: String? = null
    if (Math.random() > 0.5) {
        b = "hello"
    }
    val l = b?.length ?: -1
    println(l)

    val angga = Friend("Angga")
    val ari = null
    sayHello(angga)
    sayHello(ari)
    sayHello2(ari)
    sayHello3(ari)
}