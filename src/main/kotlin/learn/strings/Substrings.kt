package learn.strings

fun main() {
    val greeting = "Hello"
    // substring
    // startIndex - inclusive, endIndex - exclusive
    println(greeting.substring(0, 3))
    println(greeting.substring(1, 3))
    println(greeting.substring(2))
    println(greeting.substring(4, 5))
    println(greeting.substring(4, 4)) // empty string

    // substringAfter and substringBefore
    println(greeting.substringAfter('l'))
    println(greeting.substringBefore('o'))
    println(greeting.substringBefore('z'))

    /*
    As a second argument, you can specify the message to be returned
    if the delimiter argument is not present in the string
    */
    println(greeting.substringBefore("z", "can't find a character"))

    // replacing parts of a string
    val example = "Good morning..."
    println(example.replace("morning", "bye"))
    println(example.replace('.', '!'))
    //If you need to replace only the first occurrence of an argument, use replaceFirst.
    val exampleFirst = "one one two three"
    println(example.replaceFirst("one", "two"))
}