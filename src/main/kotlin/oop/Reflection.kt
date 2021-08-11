package oop

import oop.data.Customer
import oop.data.NotBlank
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

data class CreateProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    val price: Long
)

data class CreateCategoryRequest(
    @NotBlank val id: String,
    @NotBlank val category: String
)

fun validateRequest(request: Any) {
    val classRequest = request::class
    val properties = classRequest.memberProperties
    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null) {
            when (val value = property.call(request)) { // get property from request
                is String -> {
                    if (value == "") {
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val customer = Customer("Angga", "premium", 50000)
    val customerReflection = customer::class

    val constructors = customerReflection.constructors
    val functions = customerReflection.memberFunctions
    val parameters = customerReflection.memberProperties
    val annotations = customerReflection.annotations

    println(constructors)
    println(functions)
    println(parameters)
    println(annotations)

    val request = CreateProductRequest("1", "", 2000)
    validateRequest(request)
}