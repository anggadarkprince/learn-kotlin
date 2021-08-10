package oop.data

// automatic create function equals() hashCode() toString() and copy() for all properties
data class Product(
    val name: String,
    val price: Int,
    val category: String
)