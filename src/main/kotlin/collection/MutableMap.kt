package collection

fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf()
    mutableMap.put("name", "Angga")
    mutableMap.put("gender", "male")
    mutableMap["age"] = "28"

    println(mutableMap["name"])
    println(mutableMap.get("age"))
    println(mutableMap.getOrDefault("hobbt", "Reading"))
    println(mutableMap.size)

    for ((key, value) in mutableMap) {
        println("$key: $value")
    }
}