package collection

fun <T> displayMutableIterable(iterable: MutableIterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        //iterator.remove() // can remove data
        println(iterator.next())
    }
}

fun main() {
    displayMutableIterable(mutableListOf("Angga", "Ari", "Wijaya"))
    displayMutableIterable(mutableSetOf("Angga", "Ari", "Wijaya"))
    displayMutableIterable(mutableMapOf("Angga" to "Wijaya").entries)
}