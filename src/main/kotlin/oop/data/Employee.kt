package oop.data

// by default kotlin class modifier is final or cannot be inherited, set to open
open class Employee(val name: String) {

    // by default kotlin fun modifier is final or cannot be overridden, set to open
    open fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

    open fun sendReport() {
        println("Send report to ${this.name}")
    }
}

// no need to add val/var to constructor because it inherits from the parent already
open class Manager(name: String) : Employee(name) {
    // override function by default is open, make it final to disallow to override by its child
    override fun sayHello(name: String) {
        println("Hello $name, my name is Manager ${this.name}")
    }

    final override fun sendReport() {
        println("Send report to ${this.name} with charts")
    }
}

class ProductManager(name: String) : Manager(name) {
    // allowed to override by the child
    override fun sayHello(name: String) {
        println("Hello $name, my name is Manager ${this.name}")
    }
    /* error because parent function is final
    override fun sendReport() {
        println("Send report to ${this.name} with charts")
    }*/
}

class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, my name is VP ${this.name}")
    }
}