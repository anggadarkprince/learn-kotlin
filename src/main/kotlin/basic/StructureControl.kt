package basic

fun main() {

    val score = 55

    // if-else statement
    if (score > 90) {
        println("Cool")
    } else if (score > 75) {
        println("Good Job")
    } else if (score > 60) {
        println("Not Bad")
    } else {
        println("Please try again next year")
    }

    // when statement
    var scoreLabel = "B"
    when (scoreLabel) {
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not Bad")
        }
        "D" -> {
            println("Bad")
        }
        else -> {
            println("Try Again Next Year")
        }
    }

    when (scoreLabel) {
        // if(nilai == "A" || nilai == "B" || nilai == "C")
        "A", "B", "C" -> {
            println("Congratulation you passed")
        }
        else -> {
            println("Sorry, you failed")
        }
    }

    scoreLabel = "E"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (scoreLabel) {
        in nilaiLulus -> println("YOU PASSED")
        !in nilaiLulus -> println("YOU FAILED")
    }

    val name = "Eko"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    val nilaiUjian = 91
    when {
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Try Again Next Year")
    }
}