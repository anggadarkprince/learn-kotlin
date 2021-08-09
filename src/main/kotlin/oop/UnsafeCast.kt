package oop

fun printString(any: Any) {
    val value: String? = any as? String
    println(value)
}

fun printSafeString(any: Any) {
    val value = any as String
    println(value)
}

fun main() {
    printString("Angga")
    //printString(4) // throw java.lang.ClassCastException

    printString(4) // safe, automatically convert to null
}