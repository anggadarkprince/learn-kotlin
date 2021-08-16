package collection

fun main() {
    // transformation: zipping (merge collection)
    val list1: List<String> = listOf("Angga", "Ari", "Wijaya")
    val list2: List<String> = listOf("Keenan", "Evander", "Alastair")

    val list3: List<Pair<String, String>> = list1.zip(list2)
    println(list3) // list of pairs

    // zip with transformation callback
    val list4: List<String> = list1.zip(list2) { value1, value2 ->
        "$value1 $value2"
    }
    println(list4)
}