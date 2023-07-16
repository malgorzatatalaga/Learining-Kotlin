package learn.collections

fun main() {
    checkIfObjIsString()

    processInput(5.0)

    printLength("kotki")

    //ClassCastException
    try {
        val obj: Any = 5
        val str: String = obj as String
        println(str.uppercase())
    } catch (e: ClassCastException) {
        println("The object cannot be cast to a string")
    }

    exampleFunction<String>("kotki")

}

fun checkIfObjIsString() {
    val obj: Any = "Hello, Kotlin"
    if (obj is String) {
        println(obj.uppercase())
    } else {
        println("obj is not a String")
    }
}

fun processInput(input: Any) {
    when (input) {
        is Int -> println("Input is an integer")
        is String -> println("Input is a string")
        is Double -> println("Input is a double")
        else -> println("Unknown input")
    }
}

fun printLength(obj: Any) {
    if (obj is String) {
        //smart cast
        println(obj.length)
    }
}

fun <T> exampleFunction(obj: Any) {
    val tObj: T? = obj as? T
    if (tObj != null) {
        println("obj can be safely cast to type parameter T")
    } else {
        println("obj cannot be cast to type parameter T")
    }
}

fun <T> getStringsOnly(list: List<T>): List<String> {
    val result = mutableListOf<String>()
    for (element in list) {
        if (element is String) {
            result.add(element)
        }
    }
    return result
}


