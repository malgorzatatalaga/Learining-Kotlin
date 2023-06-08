fun main() {

//    If when is used as an expression, the else branch is mandatory,
//    unless the compiler can detect that all possible cases are covered by the branch conditions.

    val result = when ("Hello") {
        // If obj equals "1", sets result to "one"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(result)
    // Greeting

//    In the example below, the if expression is passed directly to the println()
//    function without declaring a variable, and println() prints the result.

    val a = readLine()?.toInt()
    val b = readLine()?.toInt()

    println(
        if (a == b) {
            "a equal b"
        } else if (a!! > b!!) {
            "a is greater than b"
        } else {
            "a is less than b"
        }
    )

//    when expressions can also be used with ranges and more complex conditions. Here's an example:
    val number = 15

    when {
        number < 0 -> println("Negative number")
        number in 1..10 -> println("Number between 1 and 10")
        number % 2 == 0 -> println("Even number")
        else -> println("Odd number greater than 10")
    }

//    Loops can be used to process characters, strings, and any other data types.
//    The program below displays English letters in a single line.
//    It is possible to get the next character (according to the Unicode table) using the
//    increment operator.

    var letter = 'A'

    while (letter <= 'Z') {
        print(letter)
        letter++
    }
}