package oop

import oop.data.ObservableProperty

fun main() {
    val value = ObservableProperty("No name")
    value.name = "Angga"
    value.name = "Ari"
    value.name = "Wijaya"
}