package collection

fun main() {
    // plus minus operator (add or remove data)
    val list1 = listOf("Angga", "Ari", "Wijaya")
    val list2 = list1 + "Programmer"
    println(list2)

    val list3 = list1 + listOf("Keenan", "Evander", "Alastair")
    println(list3)

    val list4 = list1 - "Angga"
    println(list4)

    val list5 = list1 - listOf("Angga", "Ari", "Wijaya")
    println(list5)

    // map operation
    val map1 = mapOf("a" to "Angga", "b" to "Ari")
    val map2 = map1 + ("c" to "Wijaya")
    println(map2)
    val map3 = map1 - "a"
    println(map3)
}