package basic.function

fun helloWorld() {
    println("Hello world")
}

fun sayHello(name: String, age: Int?) {
    if (age == null) {
        println("Hello $name")
    } else {
        println("Hello $name ($age)")
    }
}

fun registerUser(name: String, email: String, isActive: Boolean = true) {
    val status: String = if (isActive) "Active" else "Inactive"
    println("$name with email $email is $status")
}

fun signUp(id: Int = 0, name: String, email: String, isActive: Boolean = true) {
    println("$name with email $email is registered")
}

fun turnOff(): Unit {
    println("Shutting down...")
}

fun login(username: String, password: String): Boolean {
    if (username == "admin" && password == "secret") {
        return true
    }
    return false
}

fun sum(num1: Int, num2: Int): Int = num1 + num2

fun finalValue(name: String, vararg values: Int): Double {
    var total = 0.0;
    for (value in values) {
        total += value
    }
    return total;
}

fun String.hello(): String {
    return "Hello $this"
}

fun String.helloWorld(): String {
    return "Hello world $this"
}

infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    // function calling
    helloWorld()
    helloWorld()

    // parameter
    sayHello("Angga", 25)
    sayHello("Angga", null)

    // default parameter
    registerUser("Angga", "angga@mail.com")

    // function named argument
    signUp(email = "angga@mail.com", name = "Angga")

    // unit return argument (like void in java)
    // function above by default return Unit data type (void)
    turnOff()

    // return function
    val isLoggedIn = login("admin", "secret")
    println("User login: $isLoggedIn")

    // single expression function
    println("1 + 1 = " + sum(1, 1))

    // function varargs parameter
    // last parameter as variable arguments (array) and optional by default
    finalValue("Sum total") // allowed without default value will result empty array
    val totalFinal = finalValue("Sum total", 4, 5, 6, 7)
    println(totalFinal)

    // extension function
    val name: String = "Angga"
    val hello: String = name.hello()
    println(hello)
    "Angga".helloWorld()

    // infix notation function,
    // function member class or extension function, only 1 argument, no vararg or default value
    println("Angga" to "UP")

    // function scope (inner function)
    fun sayHay() {
        println("Say hay only can be called inside main()")
    }
    sayHay()
}