package collection

fun main() {
    // windowed: get snapshot of window by step and size
    // 1 2 3 4 5: [1, 2, 3], [2, 3, 4]... (step 1 - size 3)
    //            [1, 2], [3, 4]... (step 2 - size 2)
    //            [1, 2], [4, 5]... (step 3 - size 2)
    val numbers = listOf(1, 2, 3, 4, 5)

    println(numbers.windowed(3, 1, false)) // must 3 element each item
    println(numbers.windowed(3, 1, false) { it.size }) // transformation callback
    println(numbers.windowed(3, 1, true)) // partial allowed, 1 or 2 element only
    println(numbers.windowed(3, 1, true) { it.size })

    println(numbers.windowed(3, 2, false))
    println(numbers.windowed(3, 2, true))
}