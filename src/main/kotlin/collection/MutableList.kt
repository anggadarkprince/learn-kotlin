package collection

fun main() {
    val mutableList: MutableList<String> = mutableListOf("Angga", "Ari", "Ari", "Wijaya")
    println(mutableList[0])
    println(mutableList)
    mutableList.add("Budi")
    mutableList.remove("Ari") // remove first found
    println(mutableList)
    mutableList.removeAll(listOf("Angga", "Ari"))
    println(mutableList)
    mutableList.set(1, "Keenan") // update
    println(mutableList)
    mutableList[2] = "Hello" // error, cannot point index that not exist (use add)
}