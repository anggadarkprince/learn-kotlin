package oop

import oop.data.Customer
import oop.data.Student

fun main() {
    val customer = Customer("Angga", "premium", 50000)

    // let function, access the object via "it"
    customer.let {
        it.name = "Ari"
        println("${it.name} ${it.type}")
    }

    // run function, same as let but access object via "this"
    customer.run {
        println(this.name)
        println(this.type)
        println(this.balance)
    }

    // apply function, same as run but return the object itself
    val student = Student("Angga").apply {
        this.name = this.name.uppercase()
    }
    println(student.name)

    // also function, same as let but return the object itself
    val student2 = Student("Angga").also {
        it.name = it.name.uppercase()
    }
    println(student2.name)

    // with function, same as run but not extension function, then call manually
    val student3 = Student("Keenan")
    with(student3) {
        this.name = this.name.uppercase()
    }
    println(student3.name)


}