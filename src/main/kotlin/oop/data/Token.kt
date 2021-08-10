package oop.data

// An inline class must have a single property initialized in the primary constructor.
// No actual instantiation of class 'Token' happens
// At runtime 'value' contains just 'String'
// For JVM backends
@JvmInline
value class Token(val value: String) {
    init {
        require(value.isNotEmpty()) {
            println("Value is required")
        }
    }

    fun toUpper(): String = value.uppercase()

    val length: Int
        get() = value.length
}