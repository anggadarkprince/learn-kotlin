package basic

fun main() {
    val array = arrayOf("Angga", "Ari", "Wijaya", "Joko", "Budi", "Rudi")

    // for loop
    var total = 0
    for (name in array) {
        println(name)
        total++
    }
    println("Total $total")

    // loop down decrement 2
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    val sizeArray = array.size - 1
    for (i in 0..sizeArray) {
        println("Index $i = ${array.get(i)}")
    }

    // while loop
    var i = 0
    while (i < 10) {
        println("Loop $i")
        i++
    }
    println("Loop complete")

    // do while loop
    var j = 0
    do {
        println("Loop $j")
        j++
    } while (j < 10)
}