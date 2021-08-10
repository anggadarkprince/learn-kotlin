package oop.data

interface Base {
    fun sayHello(name: String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

class ManualDelegation(val base: Base) : Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }
}