package learn.hyperskill

fun main() {
//  we can use it to get default values when the variable is null
    var x: String? = null
    x = x ?: "Hello"
    println(x) // "Hello"

    val age: Int? = null
    val name: String? = "Bob"
    val nickname: String? = null
    val length: Int = nickname?.length ?: 0
    println("$age ${name?.length} $length")

    val line = readLine() ?: throw IllegalStateException()
    println("Elvis says: $line")
}

fun makeAnException(): Nothing {
    throw Exception("I'm an exception!")
}

fun stringException() {
    val index = readLine()!!.toInt()
    val word = readLine()!!
    println(
        if (index > word.length - 1 || index < 0) {
            throw Exception("There isn't such an element in the given string, please fix the index!")
        } else {
            word[index]
        }
    )
}

fun elvisOperator() {
    var name: String? = "Kotlin"
    val length1: Int? = name?.length
    print(length1 ?: 0)
//  we can throw exceptions in the right part
    val length2: Int = name?.length
        ?: throw Exception("The name is null")
}
