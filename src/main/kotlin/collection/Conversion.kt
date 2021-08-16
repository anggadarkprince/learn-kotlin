package collection

fun main() {
    val array = arrayOf("Angga", "Ari", "Wijaya")
    val range = 1..100
    val list = range.toList()
    val mutableList = array.toMutableList()
    val set = list.toSet()
    val mutableSet = list.toMutableSet()
    val sortedSet = list.toSortedSet()
    println(range)
    println(list)
}