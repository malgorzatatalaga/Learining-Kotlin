package learn.math

import kotlin.math.abs
import kotlin.math.hypot

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

/*
Change and implement the perimeter() function to calculate the perimeter of a polygon
with 3 or 4 vertices, represented by X and Y coordinates. Vertices are passed sequentially.
*/
fun perimeter(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double = x1,
    y4: Double = y1
): Double {
    return hypot(x1 - x2, y1 - y2) + hypot(x2 - x3, y2 - y3) + hypot(x3 - x4, y3 - y4)
    +hypot(x4 - x1, y4 - x1)
}

