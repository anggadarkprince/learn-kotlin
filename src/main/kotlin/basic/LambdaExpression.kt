package basic

// inline function
inline fun helloInline(
    name: () -> String,
    noinline lastName: () -> String
): String {
    return "Hello ${name()} ${lastName()}"
}

fun main() {
    // lambda expression structure
    val lambdaNameAlias: (String) -> String = { value: String ->
        value.uppercase()
    }
    // auto lambda data type
    val lambdaUpper = { value: String -> value.uppercase() }

    // keyword it if only one parameter
    val lambdaItName: (String) -> String = {
        it.uppercase()
    }

    // multiple parameter without type
    val lambdaNameAlias2: (String, String) -> String = { firstName, lastName ->
        "$firstName $lastName"
    }

    // unused parameter
    val lambdaNameAlias3: (String, String) -> String = { _, lastName ->
        "Mr. $lastName"
    }

    // method reference
    fun toUpper(value: String): String = value.uppercase()
    val lambdaReference: (String) -> String = ::toUpper

    // higher order function
    fun hello(value: String, transformer: (String) -> String): String {
        return "Hello ${transformer(value)}"
    }

    fun helloWithId(value: String, transformer: (String) -> String, id: Int = 0): String {
        return "Hello ${transformer(value)} with ID $id"
    }

    println(lambdaNameAlias("Angga"))
    println(lambdaNameAlias2("Angga", "Ari"))
    println(lambdaNameAlias3("Angga", "Ari"))
    println(lambdaReference("Angga"))

    // trailing lambda parameter
    val value2 = hello("Angga") {
        it.uppercase()
    }
    val value = helloWithId("Angga", {
        it.uppercase()
    }, 7)
    println(value)

    //println(helloInline { "Angga" })
    println(helloInline({ "Angga" }, { "Ari" }))
}