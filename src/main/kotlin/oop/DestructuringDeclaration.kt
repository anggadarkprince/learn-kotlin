package oop

import oop.data.Customer
import oop.data.Product

data class MinMax(val min: Int, val max: Int)

fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

data class Login(val username: String, val password: String)
typealias LoginCallback = (Login) -> Boolean

fun login(login: Login, callback: LoginCallback): Boolean {
    return callback(login)
}


fun main() {
    // only for data class or class with componentX()
    val product = Product("Mouse", 10000, "Electronic")
    val (name, amount) = product
    println(name)
    println(amount)

    val customer = Customer("Angga", "Premium", 500)
    val (_, type, balance) = customer
    println(type)
    println(balance)

    // function return destructuring
    val (min, max) = minmax(2, 4)
    println(min)
    println(max)

    // ignoring variable
    val (min1, _) = minmax(1, 5)
    println(min1)

    // destructuring callback parameter
    val request = Login("Angga", "secret")
    val success = login(request) { (username, password) ->
        username == "angga" && password == "secret"
    }
    println(success)
}