package basic

fun main() {
    val a: Int = 1000
    val boxedA: Int = a
    val anotherBoxedA: Int? = a

    val b: Int? = null
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA)
    println(anotherBoxedA)
    println(boxedA == anotherBoxedA) // true
    println(boxedB === anotherBoxedB) // false
    println(boxedB === anotherBoxedB) // false

    val letter: Char = 'a'
    val word: String = "angga"
    val ni: Boolean = false;
    println("$letter: $word - $ni")

    val bing: Char? = null
    println(bing)

    var testing = "as"
    testing = "34"
    println(testing)
}