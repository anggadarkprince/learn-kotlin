package collection

fun main() {
    // filtering: test if element meet condiction
    val list = listOf("Angga", "Ari", "Wijaya")

    println(list.any { it.length > 5 }) // one of element meets the condition
    println(list.none { it.length > 5 }) // none of element meet the conduction
    println(list.all { it.length > 1 }) // all element must meet the condition
    println(list.any()) // contain element
    println(list.none()) // no element
}