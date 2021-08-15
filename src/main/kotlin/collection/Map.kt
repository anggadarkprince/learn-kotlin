package collection

fun main() {
    // immutable map, or dictionary, or associative array
    // key - value
    // unique key, put existing key, will override the value

    val map: Map<String, String> = mapOf(
        "name" to "Angga",
        "gender" to "male",
        "age" to "28"
    )
    println(map.size)
    println(map.keys)
    println(map.entries)

    // same as map.entries
    for (entry in map) {
        println("${entry.key}: ${entry.value}")
    }
    for ((key, value) in map) {
        println("$key: $value")
    }
}