package collection

fun main() {
    // transformation: list string transformation (join & build string)
    val list: List<String> = listOf("Angga", "Ari", "Wijaya")

    val string1: String = list.joinToString(" ", "|", "|")
    println(string1)

    val string2: String = list.joinToString(" ", "|", "|") { it.uppercase() }
    println(string2)

    val builder = StringBuilder()
    list.joinTo(builder, " ", "|", "|")
    list.joinTo(builder, " ", ">", "<")
    list.joinTo(builder, " ", "@", "@")
    val string3 = builder.toString()
    println(string3)

    val numbers: List<Int> = (1..10).toList()
    println(numbers.joinToString())
}