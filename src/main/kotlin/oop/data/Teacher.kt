package oop.data

open class Teacher {
    public val role = "Teacher"
    public var name = ""
    private var birthday = "2021-01-01"

    public fun goToSchool() {
        println("Teacher go to school")
    }

    private fun teach() {
        println("Teaching student")
    }

    protected open fun goHome() {
        println("Teacher go home")
    }
}

class InternTeacher: Teacher() {
    protected override fun goHome() {
        println("Intern teacher go home")
    }
}