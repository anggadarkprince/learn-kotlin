package oop.data

interface Base {
    fun sayHello(name: String)
    fun sayGoodbye(name: String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodbye(name: String) {
        println("Goodbye $name")
    }
}

// create intermediate class to forward call function to base input
class ManualDelegation(val base: Base) : Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }
    override fun sayGoodbye(name: String) {
        base.sayGoodbye(name)
    }
}