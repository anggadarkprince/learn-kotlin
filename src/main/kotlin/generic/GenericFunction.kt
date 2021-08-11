package generic

import generic.data.Function

fun main() {
    val function = Function("Angga")

    function.sayHello("Ari")
    function.sayHello<String>("Wijaya")

    function.sayGoodbye<Int>(2)

}