package collection

fun main() {
    val chars: List<Char> = ('a'..'z').toList()

    // take: take element n number
    println(chars.take(3))
    println(chars.takeLast(3))
    println(chars.takeWhile { it < 'f'  })
    println(chars.takeLastWhile { it > 'w' })

    // drop: remove element n number
    println(chars.drop(3))
    println(chars.dropLast(3))
    println(chars.dropWhile { it < 'f' })
    println(chars.dropLastWhile { it > 'f' })
}