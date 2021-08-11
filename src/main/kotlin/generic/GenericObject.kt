package generic

import generic.data.MyData
import generic.data.MyDataMultiple

fun main() {
    val myDataString: MyData<String> = MyData("Angga")
    myDataString.printData()

    val myDataInt: MyData<Int> = MyData(10)
    myDataInt.printData()

    val myData: MyDataMultiple<String, Int> = MyDataMultiple("Angga", 10)
    myData.printData()
}