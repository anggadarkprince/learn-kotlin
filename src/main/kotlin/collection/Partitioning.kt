package collection

fun main() {
    // filtering: split list two collection (filtered & not filtered)
    val list: List<String> = listOf("Angga", "Ari", "Wijaya")

    // val pair: Pair<List<String>, List<String>> = list.partition { it.length > 5 }
    val (listMatch, listNotMatch) = list.partition { it.length > 5 }

    println(listMatch)
    println(listNotMatch)
}