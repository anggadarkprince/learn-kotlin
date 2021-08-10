package oop

import oop.data.InternTeacher
import oop.data.Teacher

fun main() {
    val teacher = Teacher()
    //teacher.teach() // error, private (only teacher itself)
    teacher.goToSchool()
    //teacher.goHome() // error, only teacher and the children

    val internTeacher = InternTeacher()
    internTeacher.goToSchool()
}