package oop.data

class Company(val name: String) {

    class Division(val name: String) {
        fun meeting() {
            // error because no inner modifier of this class to indicate member of the parent class
            // no need derived receiver when create the object, no guarantee the parent has the data
            //println("$name is division of ${this@Company.name}")
            println("$name is division of company")
        }
    }

    inner class Employee(val name: String) {
        fun report() {
            println("$name is working in ${this@Company.name}")
        }
    }
}