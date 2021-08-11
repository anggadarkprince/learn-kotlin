package generic.basic

class Data(val data: Any)
class DataGeneric<T>(val data: T)

fun main() {
    // polymorphism with manual casting
    val dataString = Data("Angga")
    val valueString: String = dataString.data as String

    val dataInt = Data(10)
    val valueInt: Int = dataInt.data as Int

    // generic
    val dataString2 = DataGeneric<String>("Angga")
    val valueString2: String = dataString2.data

    val dataInt2 = DataGeneric<Int>(10)
    val valueInt2: Int = dataInt2.data
}