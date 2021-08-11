package oop

data class Fruit(var total: Int) {
    // add operator function that compare, check, get/set the object
    // obj >, obj <=, obj++, obj[key], etc...
    operator fun plus(fruit: Fruit): Fruit {
        return Fruit(total + fruit.total)
    }
    operator fun minus(fruit: Fruit): Fruit {
        return Fruit(total + fruit.total)
    }
    operator fun invoke(name: String) {
        println("Invoke object fruit $name")
    }
    operator fun get(key: String): Any {
        return if (key == "total") {
            total
        } else {
            ""
        }
    }
    operator fun set(key: String, value: Int): Any {
        return if (key == "total") {
            total = value
        } else {
            total = 0
        }
    }
    operator fun compareTo(other: Any): Int {
        return total.compareTo(other as Int)
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
    println(number + 2) // number.plus(2)
    println(number - 2) // number.minus(4)
    number.times(3)
    number.div(3)
    number.rem(3)
    number.rangeTo(10)

    // in operator
    value.contains('n') // angga in b
    !value.contains('c') // angga !in c

    // index access
    println(fruit["total"]) // data[2]
    fruit["total"] = 30 // data[1] = 1000
    println(fruit.total)

    // invoke operator
    // a(i)	 =  a.invoke(i)
    // a(i, j)	a.invoke(i, j)
    fruit("Apple") // fruit.invoke()

    // equality / inequality
    number?.equals(value) ?: (value === null)
    !(number?.equals(value) ?: (value === null))

    // comparison
    println(fruit > 2)
    number.compareTo(number2) > 0
    number.compareTo(number2) < 0
    number.compareTo(number2) >= 0
    number.compareTo(number2) <= 0
}