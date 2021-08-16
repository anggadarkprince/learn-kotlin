package collection

class Member(val name: String, val hobbies: List<String>)

fun main() {
    val list: List<List<String>> = listOf(
        listOf("Angga", "Ari", "Wijaya"),
        listOf("Keenan", "Evander", "Alastair"),
        listOf("Diana", "Eka", "Wulandari"),
    )

    val listString: List<String> = list.flatten()
    println(listString)

    val members: List<Member> = listOf(
        Member("Angga", listOf("Reading", "Coding")),
        Member("Ari", listOf("Gaming", "Traveling"))
    )

    // val hobbies = members.map { it.hobbies } .flatten()
    //val hobbies: List<String> = members.flatten() // cannot flatten because element is not iterable
    val hobbies: List<String> = members.flatMap { it.hobbies }
    println(hobbies)
}