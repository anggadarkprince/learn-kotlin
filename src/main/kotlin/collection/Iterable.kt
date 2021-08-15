package collection

fun <T> displayIterable(iterable: Iterable<T>) {
    //for (value in iterable) {
    //    println(value)
    //}
    val iterator = iterable.iterator()
    while (iterator.hasNext()) println(iterator.next())
}

fun main() {
    // superclass from collection interface
    displayIterable(listOf("Angga", "Ari"))
    displayIterable(mutableSetOf("Angga", "Ari", "Wijaya"))
    displayIterable(mutableMapOf("Angga" to "Wijaya").entries)
}