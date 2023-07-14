package learn.math

import kotlin.math.abs

fun main() {
    knightsOnAChessboard(1, 1, 2, 3)
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

