package learn.tasklist

import java.util.*
import kotlin.math.hypot
import kotlin.math.pow

fun main() {
    val input = readln()
    val number = readln().toInt()
    when (input) {
        "amount" -> deposit(amount = number)
        "percent" -> deposit(percent = number)
        "years" -> deposit(years = number)
    }

    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()
    val output = (number1..number2).count { it % number3 == 0 }

    println(output)
}

fun FTNNumbers() {

    when (readln().toInt()) {
        0, 1, 2, 3, 5, 8, 13, 21, 34, 55 -> println("F")
        0, 1, 3, 6, 10, 15, 21, 28, 36, 45 -> println("T")
        1, 10, 100, 1000, 10000, 100000 -> println("P")
        else -> println("N")
    }
}

fun f(x: Double): Double {
    val x = readln().toDouble()

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
    +hypot(x4 - x1, y4 - x1)
}

fun deposit(amount: Int = 1000, percent: Int = 5, years: Int = 10) {
    val finalAmount = (amount.toDouble() * (1.00 + percent / 100.00).pow(years.toDouble())).toInt()
    println(finalAmount)
}

class ByteTimer(var time: Int) {
    init {
        time = if (time > 127) {
            127
        } else if (time < -128) {
            -128
        } else {
            time
        }
    }
}

fun counting() {
    val nNumber = readln().toInt()
    var numbers = emptyArray<Int>()
    for (i in 1..nNumber) {
        val number = readln().toInt()
        numbers += number
    }
    val mNumber = readln().toInt()
    val count = numbers.count { it == mNumber }
    println(count)

//    yes/no output
    println(
        if (numbers.contains(mNumber)) {
            "YES"
        } else {
            "NO"
        }
    )
}

fun triples() {
    val scanner = Scanner(System.`in`)
    var triple = 0
    val size = scanner.nextInt()
    var numbers = arrayOf(size)

    while (scanner.hasNext()) {
        val number = scanner.nextInt()
        numbers += number
    }

    numbers.forEach { i -> println(i) }

    for (i in 0 until size - 2) {
        if (numbers[i] == numbers[i + 1] - 1 && numbers[i] == numbers[i + 2] - 2) {
            triple += 1
        }
    }

    println(triple)
}

