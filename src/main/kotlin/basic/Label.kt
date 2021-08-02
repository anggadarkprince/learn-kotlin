package basic

fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

fun main() {
    myLabel@ for (x in 1..10) { // appling the custom label
        innerLoop@ for (inner in 1..5) {
            if (x == 5) {
                println("I am inside if block with value " + x + "\n-- hence it will close the operation")
                break@myLabel //specifing the label
            } else {
                println("I am inside else block with value " + x)
                continue@myLabel
            }
        }
    }

    test("Hello") test@{
        if (it == "") {
            return@test
        } else {
            println("Angga")
        }
    }
}