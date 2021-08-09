package oop

import oop.data.Note

fun main() {
    val note = Note("Buy a coffee")
    note.title = "" // not change because check isNotBlank()
    println(note.title)

    note.description = "This is a coffee"
    println(note.description)
    println(note.bigTitle)
}