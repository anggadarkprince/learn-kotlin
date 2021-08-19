package collection

fun main() {
    val set = setOf("Angga", "Ari", "Wijaya")
    println(set.elementAt(0))
    println(set.first())
    println(set.last())
    println(set.elementAtOrNull(2))
    println(set.elementAtOrNull(10))
    println(set.elementAtOrElse(2) { "Nothing" })
    println(set.elementAtOrElse(10) { "Not Found" })
}