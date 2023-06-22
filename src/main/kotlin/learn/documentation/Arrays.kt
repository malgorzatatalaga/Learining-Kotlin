package learn.documentation

fun main() {
    val numbers = IntArray(10) { i -> i + 1 }
    println("Numbers: ${numbers.joinToString()}")

    val onlyMinusOne = IntArray(10).apply { fill(-1) }
    println("Only -1: ${onlyMinusOne.joinToString()}")

    val numberS = IntArray(5) { readLine()!!.toInt() } // on each line single numbers from 1 to 5
    println(numberS.joinToString())

//    comparing 2 arrays
    val numbers1 = intArrayOf(1, 2, 3, 4)
    val numbers2 = intArrayOf(1, 2, 3, 4)
    val numbers3 = intArrayOf(1, 2, 3)

    println(numbers1.contentEquals(numbers2)) // true
    println(numbers1.contentEquals(numbers3)) // false
}