package basic

fun main() {

    val names: Array<String> = arrayOf("Angga", "Ari", "Wijaya")
    // names.set(0, "Rudi")
    names[0] = "Rudi"
    println(names[0])

    val nilai: Array<Int> = arrayOf(10,9,8)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "Angga"
    members[1] = "Angga"
    members[2] = "Angga"
    members[3] = null
    members[4] = "Angga"
    println(members.size)

}