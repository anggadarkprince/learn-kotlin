package collection

import collection.data.Person

fun main() {
    // transformation: association (transform list into Map)
    val list: List<String> = listOf("Angga", "Ari", "Wijaya")

    val map: Map<String, Int> = list.associate { Pair(it, it.length) }
    println(map)

    val map2: Map<String, Int> = list.associateWith { it.length }
    println(map2)

    val map3: Map<Int, String> = list.associateBy { it.length }
    println(map3)

    val listPerson = listOf(
        Person("Angga", 25),
        Person("Keenan", 5),
        Person("Ara", 10)
    )
    val personWithAge = listPerson.associate<Person, String, Int> { Pair(it.name, it.age) }
    println(personWithAge)
}