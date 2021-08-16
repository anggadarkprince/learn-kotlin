package collection

fun <T> displayMutableListIterator(listIterator: MutableListIterator<T>) {
    while (listIterator.hasNext()) println(listIterator.next())
    while (listIterator.hasPrevious()) println(listIterator.previous())
}

fun removeOddNumber(mutableListIterator: MutableListIterator<Int>) {
    while (mutableListIterator.hasNext()) {
        val item = mutableListIterator.next()
        if (item % 2 == 1) {
            // remove current item
            mutableListIterator.remove()
        } else {
            println(mutableListIterator.next())
        }
    }
}

fun main() {
    displayMutableListIterator(mutableListOf("Angga", "Ari", "Wijaya").listIterator())
    removeOddNumber(mutableListOf(1, 2, 3, 4, 5).listIterator())
}