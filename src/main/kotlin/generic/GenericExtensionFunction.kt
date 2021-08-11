package generic

class Data<T>(val data: T)

// only apply for string type
fun Data<String>.print() {
    val string = this.data
    println("String value is $string")
}

// error because same name, use different name
// or add JVM annotation to change on compile
@JvmName("printInt")
fun Data<Int>.print() {
    val string = this.data
    println("String value is $string")
}

fun main() {
    val data1: Data<String> = Data("Angga")
    val data2 = Data(100)

    data1.print()

    // because object type integer (before add extension for Int)
    //data2.print()

    // after add extension for Int
    data2.print()
}