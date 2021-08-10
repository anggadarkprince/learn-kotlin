package oop.data

sealed class Operation(val name: String)

class Plus: Operation("Add")
class Minus: Operation("Minus")