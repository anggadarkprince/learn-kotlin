package generic

class Invariant<T>(var data: T)

fun main() {
    val invariantString = Invariant("String")
    // cannot substitute parent to child, see covariant and contravariant
    //val invariantAny: Invariant<Any> = invariantString
    //invariantAny.data = 100
}