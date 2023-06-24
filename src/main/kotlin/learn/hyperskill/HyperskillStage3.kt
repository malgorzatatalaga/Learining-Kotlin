package learn.hyperskill

fun main() {

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