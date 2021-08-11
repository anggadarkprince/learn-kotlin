package generic

// generic type check when compile time and ignoring check in runtime
class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data
}

fun main() {
    val data = TypeErasure("Angga")
    val name = data.getData()
    println(name)

    // because in bytecode everything convert to Any or Object
    // convert data to Int possible
    val ari = data as TypeErasure<Int>
    val name2 = ari.getData() // but when access data will error in runtime
    println(name2)

    // tools - kotlin - show kotlin bytecode
}