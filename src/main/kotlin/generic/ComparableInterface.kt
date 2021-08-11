package generic

class Fruit(val name: String, val quantity: Int) : Comparable<Fruit> {
    override fun compareTo(other: Fruit): Int {
        // return 0 = match, 1 = more, -1 = less
        return quantity.compareTo(other.quantity)
    }
}

fun main() {
    val fruit1 = Fruit("Apple", 100)
    val fruit2 = Fruit("Apple", 10)

    println(fruit1 > fruit2)
    println(fruit1 >= fruit2)
    println(fruit1 < fruit2)
    println(fruit1 <= fruit2)
}