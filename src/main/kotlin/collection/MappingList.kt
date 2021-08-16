package collection

fun main() {
    // transformation: map
    val list: List<String> = listOf("Angga", "Ari", "Wijaya")

    //val temp = mutableListOf<String>()
    //for(value in list){
    //    temp.add(value.toUpperCase())
    //}

    // val list2 = list.map { value -> value.uppercase() }
    val list2 = list.map { it.uppercase() }
    println(list2)

    val set1 = setOf("Keenan", "Evander", "Alastair")
    val set2 = set1.map { it.uppercase() }
    println(set2)

    val names = listOf("Angga", "Ari", null, "Wijaya", "Keenan", "Evander", "Alastair", null)
    val namesOdd = names.mapIndexedNotNull { index, name ->
        if (index % 2 == 0) null
        else name
    }
    println(namesOdd)

    val numbers = (1..100).toList()
    val odd = numbers.mapNotNull {
        if (it % 2 == 0) null
        else it
    }
    println(odd)
}