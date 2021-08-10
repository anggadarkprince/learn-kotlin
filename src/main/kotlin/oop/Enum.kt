package oop

import oop.data.Gender
import oop.data.Gender2

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val all: Array<Gender> = Gender.values()
    println(man)
    all.iterator().forEach { println(it) }
    println()

    val man2 = Gender2.MALE
    val woman2 = Gender2.FEMALE
    man2.printDescription()

    woman2.description = "This is female"
    woman2.printDescription()
}