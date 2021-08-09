package oop.data

// primary constructor, always called first after secondary constructor
class Car(paramBrand: String, paramName: String, paramYear: Int = 0) {

    init {
        println("Car $paramBrand is created")
    }

    // secondary constructor, call primary constructor (required)
    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2021) {
        println("Secondary constructor")
    }

    // another secondary constructor, call above, then above call primary constructor (required)
    constructor(paramBrand: String) : this(paramBrand, "")

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear
}