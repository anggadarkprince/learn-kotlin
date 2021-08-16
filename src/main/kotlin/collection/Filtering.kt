package collection

fun main() {
    // filtering: filter by predicate - select element of list by condition
    val list1 = listOf("Angga", "Ari", "Wijaya")
    val list21 = list1.filter { it.length > 5 }
    println(list21)

    val list22 = list1.filterNot { it == "Ari" }
    println(list22)

    val list3 = list1.filterIndexed { index, value -> index % 2 == 0 }
    println(list3)

    val list4: List<Any?> = listOf(null, 1, "Angga", "Ari", 2, null)
    val listString = list4.filterIsInstance<String>()
    println(listString)

    val listInt = list4.filterIsInstance<Int>()
    println(listInt)

    val listNotNull = list4.filterNotNull()
    println(listNotNull)
}