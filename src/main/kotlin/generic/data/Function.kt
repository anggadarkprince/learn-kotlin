package generic.data

// class Function<T> global generic
class Function(val name: String) {

    // Generic scope function, if class has generic type,
    // then current function is overridden the generic
    fun <T> sayHello(param: T) {
        println("Hello $param, my name is $name")
    }

    // different <T> with sayHello() function
    fun <T> sayGoodbye(param: T) {
        println("Say goodbye")
    }
}