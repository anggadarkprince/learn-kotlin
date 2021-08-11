package generic

fun displayLength(array: Array<*>) {
    println("Total array ${array.size}")
}

fun main() {
    val arrayInt = arrayOf(1, 2, 3, 4, 5)
    val arrayString = arrayOf("angga", "ari", "wijaya")

    displayLength(arrayInt)
    displayLength(arrayString)
}