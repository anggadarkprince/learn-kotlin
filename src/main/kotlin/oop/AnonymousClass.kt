package oop

import oop.data.Action
import oop.data.fireAction

fun main() {
    fireAction(object : Action {
        override fun action() {
            println("Action 1")
        }
    })
    fireAction(object : Action {
        override fun action() = println("Action 2")
    })
}