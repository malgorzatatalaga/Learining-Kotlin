package learn.collections

import java.util.*

fun main() {
    val numbers = IntArray(10) { i -> i + 1 }
    println("Numbers: ${numbers.joinToString()}")

    val onlyMinusOne = IntArray(10).apply { fill(-1) }
    println("Only -1: ${onlyMinusOne.joinToString()}")

    val numberS = IntArray(5) { readLine()!!.toInt() } // on each line single numbers from 1 to 5
    println(numberS.joinToString())

    fun compareArrays() {
        val numbers1 = intArrayOf(1, 2, 3, 4)
        val numbers2 = intArrayOf(1, 2, 3, 4)
        val numbers3 = intArrayOf(1, 2, 3)
        println(numbers1.contentEquals(numbers2)) // true
        println(numbers1.contentEquals(numbers3)) // false
    }
//    string arrays
    val stringArray = arrayOf("array", "of", "strings")
    var newEmptyArray = emptyArray<String>()
    newEmptyArray += "cats"
    newEmptyArray += "are"
    newEmptyArray += "cute"
    println(newEmptyArray.joinToString())
}

fun triples() {
    val scanner = Scanner(System.`in`)
    var triple = 0
    val size = scanner.nextInt()
    var numbers = arrayOf(size)

    while (scanner.hasNext()) {
        val number = scanner.nextInt()
        numbers += number
    }

    numbers.forEach { i -> println(i) }

    for (i in 0 until size - 2) {
        if (numbers[i] == numbers[i + 1] - 1 && numbers[i] == numbers[i + 2] - 2) {
            triple += 1
        }
    }

    println(triple)
}

fun counting() {
    val nNumber = readln().toInt()
    var numbers = emptyArray<Int>()
    for (i in 1..nNumber) {
        val number = readln().toInt()
        numbers += number
    }
    val mNumber = readln().toInt()
    val count = numbers.count { it == mNumber }
    println(count)

//    yes/no output
    println(
        if (numbers.contains(mNumber)) {
            "YES"
        } else {
            "NO"
        }
    )
}
