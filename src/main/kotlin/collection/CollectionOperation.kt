package collection

fun main() {
    // operation: transform, filtering, grouping, retrieving, aggregate
    listOf("Angga", "Ari").forEach { value -> println(value) }
    listOf("Angga", "Ari", "Wijaya").forEachIndexed { index, s -> println("$index - $s")  }
}