package oop.data

enum class DAYS{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

enum class Gender {
    MALE, FEMALE
}

enum class Gender2(var description: String) {
    MALE("Male"),
    FEMALE("Female");

    fun printDescription() {
        println(description)
    }
}