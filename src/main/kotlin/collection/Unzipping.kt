package collection

fun main() {
    // transformation: unzip (extract list of pair into separate keys-values collection)
    val list: List<Pair<String, String>> = listOf(
        "name" to "Angga Ari Wijaya",
        "birthday" to "1992-05-26",
        "location" to "Surabaya, Indonesia"
    )

    val pair: Pair<List<String>, List<String>> = list.unzip()
    println(pair.first)
    println(pair.second)

    val (list1, list2) = list.unzip()
    println(list1)
    println(list2)
}