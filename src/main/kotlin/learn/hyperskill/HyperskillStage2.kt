package learn.hyperskill

fun main() {
    f(1.0)
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

fun f3(x: Double): Double  {
    return x * x - 1
}