package learn.documentation

fun main() {
    val (var1, op, var2) = readLine()!!.split(" ")

    val a = var1.toInt()
    val b = var2.toInt()

    when (op) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        else -> println("Unknown operator")
    }

    // If there are several cases to handle it, you can combine and separate them with a comma.
    when (op) {
        "+", "plus" -> println(a + b)
        "-", "minus" -> println(a - b) // trailing comma
        "*", "times" -> println(a * b)
        else -> println("Unknown operator")
    }

    //You can also use complex blocks with multiple statements as branches:

    when (op) {
        "+", "plus" -> {
            val sum = a + b
            println(sum)
        }

        "-", "minus" -> {
            val diff = a - b
            println(diff)
        }

        "*", "times" -> {
            val product = a * b
            println(product)
        }

        else -> println("Unknown operator")
    }

    //when expressions can also be used with ranges and more complex conditions. Here's an example:
    val number = 15

    when {
        number < 0 -> println("Negative number")
        number in 1..10 -> println("Number between 1 and 10")
        number % 2 == 0 -> println("Even number")
        else -> println("Odd number greater than 10")
    }

    /*
    If when is used as an expression, the else branch is mandatory,
    unless the compiler can detect that all possible cases are covered by the branch conditions.
    */

    val result = when ("Hello") {
        // If obj equals "1", sets result to "one"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }

    println(result)

    /*
    If a branch contains a block with multiple statements enclosed in {...},
    the last line must be a single value or a complex expression that will
    be performed and returned as the result of when expression.
    */

    val blockResult = when (op) {
        "+" -> {
            val sum = a + b
            sum
        }

        else -> "Unknown operator"
    }

    println(result)

    /*
    If you work with other programming languages like Java or C#,
    you may note that when is similar to a switch statement.
    When provides more complex checking, not only directly matching a value.
    */

    val (var12, var22, var3) = readLine()!!.split(" ")

    val a1 = var12.toInt()
    val b1 = var22.toInt()
    val c = var3.toInt()

    println(
        when (c) {
            a1 + b1 -> "$c equals $a1 plus $b1"
            a1 - b1 -> "$c equals $a1 minus $b1"
            a1 * b1 -> "$c equals $a1 times $b1"
            else -> "We do not know how to calculate $c"
        }
    )

    val n = readLine()!!.toInt()

    when (n) {
        0 -> println("n is zero")
        in 1..10 -> println("n is between 1 and 10 (inclusive)")
        in 25..30 -> println("n is between 25 and 30 (inclusive)")
        else -> println("n is outside a range")
    }
}