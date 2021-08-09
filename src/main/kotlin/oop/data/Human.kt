package oop.data

interface Interaction {
    val name: String
    fun sayHello(name: String): Unit

    // concrete function
    fun sayGoodBye() {
        println("Bye, from $name")
    }
}

interface Activity {
    fun doSomething()
    fun move() {
        println("moving activity")
    }
}

interface DailyActivity: Activity {
    fun walk()
    fun run()
    fun sleep()
}

interface HumanMovement {
    fun move() {
        println("moving human")
    }
}

class Human(override val name: String) : Interaction, DailyActivity, HumanMovement {
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

    override fun walk() {
        println("$name is walking")
    }

    override fun run() {
        println("$name is running")
    }

    override fun sleep() {
        println("$name is sleeping")
    }

    override fun doSomething() {
        println("$name is doing something")
    }

    // will override all move from parent
    //override fun move() {
    //    println("moving human")
    //}
    override fun move() {
        // accessing movement
        super<HumanMovement>.move()
        super<DailyActivity>.move()
    }
}