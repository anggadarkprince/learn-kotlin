package generic

class Container<T>(var data: T)

// force param into covariant and contravariant
fun copy(from: Container<out Any>, to: Container<in Any>) {
    to.data = from.data
}

// invariant cause error string to any
//fun copy(from: Container<Any>, to: Container<Any>) {
//    to.data = from.data
//}

fun main() {
    val container1 = Container("Angga")
    val container2: Container<Any> = Container("Ari")
    copy(container1, container2)

    println(container1.data)
    println(container2.data)
}