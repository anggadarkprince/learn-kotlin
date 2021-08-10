package oop.data

class Application(val name: String) {
    object Helper {
        fun version(value: String): String {
            // cannot access parent
            // return "v$value of application ${this@Application}"
            return "v$value-released"
        }
    }

    // inner object without name, access directly from the application
    companion object {
        fun deploy(type: String) {
            println("Deploy type:$type to server")
        }
    }
}