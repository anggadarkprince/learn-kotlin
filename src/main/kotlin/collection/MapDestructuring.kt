package collection

fun main() {
    val map = mapOf(
        "a" to "Angga",
        "b" to "Ari",
        "c" to "Wijaya"
    )

    for ((key, value) in map) {
        println("$key : $value")
    }

    // map.forEach { entry -> println("${entry.component1()} : ${entry.component2()}") }
    map.forEach { (key, value) -> println("$key : $value") }
}