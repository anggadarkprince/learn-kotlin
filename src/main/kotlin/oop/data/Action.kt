package oop.data

interface Action {
    fun action(): Unit
}

fun fireAction(action: Action) {
    action.action()
}