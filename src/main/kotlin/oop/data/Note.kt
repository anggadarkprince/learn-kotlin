package oop.data

class Note(title: String, description: String? = null) {
    val bigTitle: String
        get() = title.uppercase()

    var title: String = title
        get() = field
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }

    var description: String = title
        set(value) {
            if (value.isNotEmpty()) {
                field = value
            }
        }
}