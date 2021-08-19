package collection

fun main() {
    val numbers = (1..4).toList()

    println(numbers)
    println(numbers.maxOrNull())
    println(numbers.minOrNull())
    println(numbers.average())
    println(numbers.sum())

    println(numbers.sumOf { it / 2 }) // 0 (0.5) + 1 + 1 (1.5) + 2
}