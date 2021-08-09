package oop

class Company(val name: String)
class CompanyByName(val name: String) {
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is CompanyByName -> name == other.name
            else -> false
        }
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}

fun main() {
    val company1 = Company("Sketch Project")
    val company2 = Company("Sketch Project")
    println(company1.equals(company2))

    val companyEq1 = CompanyByName("Sketch Project")
    val companyEq2 = CompanyByName("Sketch Project")
    println(companyEq1.equals(companyEq2))
}