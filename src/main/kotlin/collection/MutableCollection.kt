package collection

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (item in collection) println(item)
}

fun main() {
    //displayMutableCollection(listOf("Angga", "Ari", "Wijaya")) // error
    displayMutableCollection(mutableListOf("Angga", "Ari", "Wijaya"))
    displayMutableCollection(mutableSetOf("Angga", "Ari", "Wijaya"))
    displayMutableCollection(mutableMapOf("Angga" to "Wijaya").entries)
}