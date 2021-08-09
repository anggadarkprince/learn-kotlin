package oop

fun main() {
    val company1 = Company("Sketch Project")
    val company2 = Company("Sketch Project")
    println(company1.hashCode() == company2.hashCode())

    val companyEq1 = CompanyByName("Sketch Project")
    val companyEq2 = CompanyByName("Sketch Project")
    println(companyEq1.hashCode() == companyEq2.hashCode())
}