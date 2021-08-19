package collection

fun main() {
    val map = mapOf("a" to "Angga", "b" to "Ari", "c" to "Wijaya")

    // println(map.getValue("not found")) // exception
    println(map.getValue("a"))
    println(map.getOrElse("not found") { "Ups" })
    println(map.filter { entry -> entry.value.length > 5 })
    println(map.filterKeys { it != "b" })
    println(map.filterValues { it.length > 5 })
}