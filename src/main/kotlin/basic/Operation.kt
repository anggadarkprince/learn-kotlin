package basic

fun main() {
    // boolean operand
    val score = 80
    val scoreAttendance = 80
    val scoreAdditional = 70

    val isPassed = score > 75
    val isPassedAttendance = scoreAttendance > 75
    val isPassedAdditional = scoreAdditional > 75

    val passed = isPassed && isPassedAttendance && isPassedAdditional
    // val passed = (isPassed && isPassedAttendance) && isPassedAdditional
    // val passed = ((isPassed && isPassedAttendance) && isPassedAdditional)
    println(passed)


    // comparator operand
    val a = 100
    val b = 200

    val result: Boolean = a < b
    println(result)

    println(100 >= 100)
    println(100 <= 100)

    println("a" < "b")
    println("a" == "a")
    println("a" != "b")

    // math operand
    val results = 10.0 / 3.0
    println(results)

    val result2 = 10 + 10 / 2
    println(result2)

    var total: Int = 0

    val item1 = 100
    total += item1

    val item2 = 200
    total += item2

    val item3 = 300
    total += item3

    println(total)

    total++ // total = total + 1
    total++ // total = total + 1
    total++ // total = total + 1
    println(total)

    val temp = -5
    println(temp)

    val healthy = true
    println(!healthy)
}