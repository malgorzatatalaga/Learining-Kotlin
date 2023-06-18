package learn.hyperskill

import kotlin.math.hypot

fun main() {

}

fun FTNNumbers() {
    val number = readLine()?.toInt()

    when (number) {
        0, 1, 2, 3, 5, 8, 13, 21, 34, 55 -> println("F")
        0, 1, 3, 6, 10, 15, 21, 28, 36, 45 -> println("T")
        1, 10, 100, 1000, 10000, 100000 -> println("P")
        else -> println("N")
    }
}

fun f(x: Double): Double {
    // call your implemented functions here
    val x = readLine()!!.toDouble()

    val solution: Double = when {
        x <= 0.0 -> f1(x)
        x > 0.0 && x < 1.0 -> f2(x)
        x >= 1.0 -> f3(x)
        else -> x
    }

    return solution
}

// implement your functions here
fun f1(x: Double): Double {
    return x * x + 1
}

fun f2(x: Double): Double {
    return 1 / (x * x)
}

fun f3(x: Double): Double {
    return x * x - 1
}

// Change and implement the perimeter() function to calculate the perimeter of a polygon
// with 3 or 4 vertices, represented by X and Y coordinates. Vertices are passed sequentially.

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
    + hypot(x4 - x1, y4 - x1)
}

fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false) {
    val automaticBoolean: Int = if (automatic) {
        1
    } else {
        0
    }
    val totalPrice = 20000
    println(if (maximumSpeed > 120) {
        totalPrice - old * 2000 + (maximumSpeed - 120) * 100 - kilometers/10000 * 200 + automaticBoolean * 1500
    } else if (maximumSpeed < 120) {
        totalPrice - old * 2000 - (120 - maximumSpeed) * 100 - kilometers/10000 * 200 + automaticBoolean * 1500
    } else {
        totalPrice - old * 2000 - kilometers/10000 * 200 + automaticBoolean * 1500
    })
}