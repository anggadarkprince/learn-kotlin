package collection

fun main() {
    // transformation: map
    val map: Map<Int, String> = mapOf(
        1 to "Angga",
        2 to "Ari",
        Pair(3, "Wijaya")
    )

    val mapKeys = map.mapKeys { it.key * 10 }
    println(mapKeys)

    val mapValues = map.mapValues { it.value.uppercase() }
    println(mapValues)
}