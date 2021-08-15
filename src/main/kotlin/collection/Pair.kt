package collection

fun main() {
    // represent generic pair of two values (using in map)
    // a data class (read-only)
    // another data class triple (3 items data)
    val pair1:Pair<String, String> = Pair("name", "Angga")
    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<String, String> = "name" to "Keenan"
    println(pair2.first)
    println(pair2.second)
}