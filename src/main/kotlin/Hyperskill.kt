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
            sum ++
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
