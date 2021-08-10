package oop

import oop.data.Company

fun main() {
    val company = Company("Sketch Project")
    val division = Company.Division("Development")
    println(division.meeting())

    // cannot instantiate direct without parent because keyword inner as modifier
    //val employee = Company.Employee("Angga")
    val employee = company.Employee("Angga")
    println(employee.report())
}