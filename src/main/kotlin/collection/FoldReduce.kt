package collection

fun main() {
    val numbers = (1..100).toList().shuffled()

    val max = numbers.reduce { first, second ->
        if (first > second) first
        else second
    }
    println(max)

    val min = numbers.reduce { first, second ->
        if (first < second) first
        else second
    }
    println(min)

    // fold has initial value
    val sum = numbers.fold(0) { acc, value ->
        acc + value
    }
    println(sum)
    println(numbers.sum())

    val names = listOf("Angga", "Ari", "Wijaya");
    val count = names.fold(0) { first, second ->
        first + 1
    }
    println(count)
    println(names.count())

    // reduceRight() & foldRight()
    // reduceIndexed() & foldIndexed()
    // reduceRightIndexed() & foldRightIndexed()
}