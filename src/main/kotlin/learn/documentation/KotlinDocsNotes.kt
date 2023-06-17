package learn.documentation

fun main() {
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

//    Loops can be used to process characters, strings, and any other data types.
//    The program below displays English letters in a single line.
//    It is possible to get the next character (according to the Unicode table) using the
//    increment operator.

    var letter = 'A'

    while (letter <= 'Z') {
        print(letter)
        letter++
    }

//    control sequences:
//    '\n' is the newline character;
//
//    '\t' is the tab character;
//
//    '\r' is the carriage return character;
//
//    '\\' is the backslash character itself;
//
//    '\'' is the single quote mark;
//
//    '\"' is the double quote mark.
}