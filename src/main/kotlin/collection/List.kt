package collection

fun main() {
    // immutable collection (ordered, allow repeat element)
    val list: List<String> = listOf("Angga", "Ari", "Wijaya")
    println(list.isEmpty())
    println(list.isNotEmpty()) // extension function
    println(list.get(1))
    println(list[0])
    println(list.indexOf("Budi"))
    println(list.indexOf("Angga"))
    println(list.contains("Angga"))
    println(list.containsAll(listOf("Angga", "Wijaya")))
}