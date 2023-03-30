fun main(args: Array<String>) {
    val border = "*"
    val timesToRepeat = 23
    val name = "Gosia"
    printBorder(border, timesToRepeat)
    println("Happy Birthday, ${name}!")
    printBorder(border, timesToRepeat)
    printCake()
}
fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}

fun printCake() {
    val age = 24
    val layers = 5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeCandles(age: Int) {
    println(" ")
    print(" ")
    repeat(age) {
        print(",")
    }
    println()
    print(" ")
    repeat(age) {
        print("|")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}
