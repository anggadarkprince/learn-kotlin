package oop.data

object Utility {
    val name = "Utilities"

    fun toUpper(value: String): String {
        return value.uppercase()
    }

    fun ifEmpty(value: String?, default: String = ""): String {
        return if (value.isNullOrBlank()) default else ""
    }
}