package collection

import collection.data.Person

fun main() {
    val set: MutableSet<Person> = mutableSetOf()
    set.add(Person("Angga"))
    set.add(Person("Angga"))
    set.add(Person("Angga"))
    set.add(Person("Ari"))
    println(set.size)
    println(set.contains(Person("Angga")))
}