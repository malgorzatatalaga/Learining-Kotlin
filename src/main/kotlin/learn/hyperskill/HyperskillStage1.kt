package learn.hyperskill

import java.util.*
import kotlin.math.abs

fun main() {
    knightsOnAChessboard(1, 1, 2, 3)
}

fun isVowel(letter: Char): Boolean {
    return letter.equals('A') || letter.equals('E') || letter.equals('I') || letter.equals('O') || letter.equals('U') ||
            letter.equals('a') || letter.equals('e') || letter.equals('i') || letter.equals('o') || letter.equals('u')
}

fun getLastDigit(number: Int): Int {
    return abs(number % 10)
}

fun knightsOnAChessboard(x1: Int, y1: Int, x2: Int, y2: Int) {
    if (abs(x1 - x2) == 1 && abs(y1 - y2) == 2) {
        println("YES")
    } else if (abs(x1 - x2) == 2 && abs(y1 - y2) == 1) {
        println("YES")
    } else {
        println("NO")
    }
}

fun maximumElementDivisibleVy4() {
    val scanner = Scanner(System.`in`)
    var maximumNumber = 0
    while (scanner.hasNext()) {
        val number = scanner.nextInt()
        if (number % 4 == 0 && number > maximumNumber) {
            maximumNumber = number
        }
    }
    println(maximumNumber)
}

fun theLengthOfTheSequence() {
    val scanner = Scanner(System.`in`)
    var sum = 0
    while (scanner.hasNextInt()) {
        val number = scanner.nextInt()
        if (number > 0) {
            sum++
        } else {
            break
        }
    }
    println(sum)
}

fun collatzConjecture(x: Int) {
    print(x)
    print(" ")
    var number = x
    while (number > 1) {
        if (number % 2 == 0) {
            number /= 2
            print(number)
            print(" ")
        } else {
            number *= 3
            number++
            println(number)
            print(" ")
        }
    }
}

fun twoNumbersInARow() {
    val scanner = Scanner(System.`in`)
    val length = scanner.nextInt()
    val numbers = mutableListOf<Int>()
    for (i in 1..length) {
        val number = scanner.nextInt()
        numbers.add(number)
    }
    val p = scanner.nextInt()
    val m = scanner.nextInt()
    var result = "YES"
    for (i in 1 until numbers.size) {
        if (numbers[i - 1] == p && numbers[i] == m) {
            result = "NO"
        } else if (numbers[i - 1] == m && numbers[i] == p) {
            result = "NO"
        }
    }
    println(result)
}

fun theIndexOfTheFirstMax() {
    val scanner = Scanner(System.`in`)
    val range = scanner.nextInt()
    val numbers = mutableListOf<Int>()
    while (scanner.hasNextInt()) {
        val number = scanner.nextInt()
        numbers.add(number)
    }
    val max = numbers.maxOrNull()
    println(numbers.indexOf(max))
}

fun solution(products: List<String>, product: String) {
    for (i in products.indices) {
        if (products[i] == product) {
            print(i)
            print(" ")
        }
    }
}

fun theInformationAboutAPerson() {
    val scanner = Scanner(System.`in`)
    val name = scanner.next().first()
    val surname = scanner.next()
    val age = scanner.next()

    println("$name. $surname, $age years old")
}
