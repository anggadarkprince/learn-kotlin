package collection

fun main() {
    val list = mutableListOf("Angga", "Ari", "Wijaya")

    val listReversed = list.reversed() // return new list
    val listAsReversed = list.asReversed() // all changes original will reflect to this one

    println(listReversed)
    println(list)
    println(listAsReversed)
    list.add("Keenan") // modify original
    println(listAsReversed) // reflected immediately

    list.add("Programmer")

    println(listReversed)
    println(listAsReversed)
}