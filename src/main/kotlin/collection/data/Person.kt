package collection.data

class Person(val name: String, val age: Int = 0) {
    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean = when (other) {
        is Person -> name == other.name
        else -> false
    }

    override fun toString(): String {
        return "Person with name $name"
    }
}