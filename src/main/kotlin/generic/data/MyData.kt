package generic.data

class MyData<T>(val firstData: T) {
    fun getData(): T = firstData

    fun printData() {
        println("Data is $firstData")
    }
}

class MyDataMultiple<T, U>(val firstData: T, val secondData: U) {
    fun getFirst(): T = firstData
    fun getSecond(): U = secondData

    fun printData() {
        println("Data is $firstData $secondData")
    }
}