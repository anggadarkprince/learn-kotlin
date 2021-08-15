package collection

import collection.data.Person

fun main() {
    // mutable list (not guarantee ordered, unique value)
    val set: Set<String> = setOf("Hello", "Hello", "Bye")
    println(set.size)
    println(set.contains("Hello"))
    println(set.contains("hello"))

    val setPerson: Set<Person> = setOf(
        Person("Angga"), Person("Ari"), Person("Angga"), Person("Keenan")
    )
    println(setPerson.size)
    println(setPerson.contains(Person("Angga")))

    for (person in setPerson) {
        println(person)
    }
}