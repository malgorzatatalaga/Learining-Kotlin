package learn.documentation.lambdaexpression

import kotlin.math.max

fun main() {
    //using anonymous functions
    val anonymous = fun(a: Int, b: Int): Int {
        return a * b
    }
    println(anonymous(3, 4))

    val lambda = { a: Int, b: Int -> a * b }
    println(lambda(3, 4))

    val originalText = "I don't know... what to say..."
    val textWithoutDots1 = originalText.filter { c -> c != '.' }
    //The type of it is inferred from the type of the argument being passed to the lambda.
    val textWithoutDots2 = originalText.filter { it != '.' }

    val returnGreaterNumber: (Int, Int) -> Int = { a: Int, b: Int -> max(a, b) }

    fizzbuzz(1, 100) { number ->
        if (number % 15 == 0) {
            return@fizzbuzz "fizzbuzz"
        }
        if (number % 3 == 0) {
            return@fizzbuzz "fizz"
        }
        if (number % 5 == 0) {
            return@fizzbuzz "buzz"
        }
        return@fizzbuzz number.toString()
    }

    //composition
    fun compose(g: (Int) -> Int, h: (Int) -> Int): (Int) -> Int {
        return {it -> g(h(it))}
    }

    val rangeMultiplication: (Long, Long) -> Long = { a: Long, b: Long ->
        var result = 1L
        for (i in a..b) {
            result *= i
        }
        result
    }
}

fun fizzbuzz(from: Int, to: Int, transformation: (Int) -> String) {
    for (number in from..to) {
        println(transformation(number))
    }
}
