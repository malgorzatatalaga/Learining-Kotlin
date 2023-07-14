package learn.tasklist

fun main() {
    printRed()
    printYellow()
    printGreen()
    printBlue()
}

fun printRed() {
    println("red: \u001B[101m \u001B[0m")
}

fun printYellow() {
    println("yellow: \u001B[103m \u001B[0m")
}

fun printGreen() {
    println("green: \u001B[102m \u001B[0m")
}

fun printBlue() {
    println("blue: \u001B[104m \u001B[0m")
}