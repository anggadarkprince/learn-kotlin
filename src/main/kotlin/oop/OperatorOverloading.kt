package oop

data class Fruit(val total: Int) {
    operator fun plus(fruit: Fruit): Fruit {
        return Fruit(total + fruit.total)
    }
    operator fun minus(fruit: Fruit): Fruit {
        return Fruit(total + fruit.total)
    }
}

fun hello() {
    println("Hello")
}

fun main() {
    val fruit = Fruit(100) - Fruit(50)
    println(fruit.total)

    var number = 4
    var number2 = 3
    var value = "angga"
    var isCompleted = false
    var data: Array<Int> = arrayOf(3, 4, 2, 6, 2, 1)
    var dataMulti = Array(3) { Array(2) { 0 } }

    // unary prefix
    number.unaryMinus() // +number
    number.unaryMinus() // -number
    isCompleted.not() // !isCompleted

    // incr/decr
    number.inc() // number++
    number.dec() // number--

    // aritmatic operator
    number.plus(2)
    number.minus(4)
    number.times(3)
    number.div(3)
    number.rem(3)
    number.rangeTo(10)

    // in operator
    value.contains('n') // angga in b
    !value.contains('c') // angga !in c

    // index access
    data.get(2) // data[2]
    data.set(1, 1000) // data[1] = 1000

    // invoke operator
    // a(i)	 =  a.invoke(i)
    // a(i, j)	a.invoke(i, j)

    // equality / inequality
    number?.equals(value) ?: (value === null)
    !(number?.equals(value) ?: (value === null))

    // comparison
    number.compareTo(number2) > 0
    number.compareTo(number2) < 0
    number.compareTo(number2) >= 0
    number.compareTo(number2) <= 0
}