package collection

fun <T> displayCollection(collection: Collection<T>) {
    for (item in collection) println(item)
}

fun main() {
    displayCollection(listOf("Angga", "Ari", "Wijaya"))
    displayCollection(setOf("Angga", "Ari", "Wijaya"))
    displayCollection(mapOf("Angga" to "Wijaya").entries)
    //displayCollection(mapOf("Angga" to "Wijaya")) // error, not child of collection
}