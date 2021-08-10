package oop.data

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Fancy(val author: String)

@Fancy(author = "Angga")
class MyApplication(val name: String, val version: Int) {
    fun info(): String = "Application $name-$version"
}

@Target(
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD,
    AnnotationTarget.VALUE_PARAMETER
)
annotation class Beta

class ExampleTarget(
    @field:Beta val firstName: String,
    @get:Beta val middleName: String,
    @param:Beta val lastName: String
)