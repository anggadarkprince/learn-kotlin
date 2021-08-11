package generic

// out: only return  T
// cannot receive data T from outside (should val)
// when out deleted, assumed as invariant
class Covariant<out T>(val data: T) {
    // cannot create param from T, when substitute with different data type, can cause error
    //fun sayHello(param: T) {
    //
    //}
    fun data(): T {
        return data
    }
}

fun main() {
    // substitute generic with parent type
    val covariantString = Covariant<String>("Angga")
    val covariantAny: Covariant<Any> = covariantString
}