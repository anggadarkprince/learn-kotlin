package oop.data

class Person {
    var firstName: String = ""
    var lastName: String? = null
    var age: Int = 0

    fun sayHello(name: String) {
        println("Hello $name, my name is $firstName")
    }

    // function overloading, must different type of param or count of param
    // this keyword reference of the current object (Person)
    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $firstName, my name is ${this.firstName}")
    }

    fun sayHello(totalSayHello: Int) {
        for (i in 1..totalSayHello) {
            println("Hello my name is $firstName")
        }
    }

    fun run() {
        println("$firstName is running")
    }

    fun getFullName(): String {
        return "$firstName $lastName"
    }
}