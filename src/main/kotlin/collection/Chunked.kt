package collection

fun main() {
    // chunked: split collection into pieces (each n element)
    val numbers = (1..100).toList()

    val list1 = numbers.chunked(10)
    println(list1.size)
    println(list1)

    // callback transformation
    val list2 = numbers.chunked(10) { values ->
        var total = 0
        for (value in values) {
            total += value
        }
        total
    }
    println(list2)
}