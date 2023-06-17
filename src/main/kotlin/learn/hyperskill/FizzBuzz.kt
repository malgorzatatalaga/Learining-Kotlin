package learn.hyperskill

fun main() {
    //Note that all branch conditions are checked sequentially
    //until one of them is satisfied. So only the first suitable branch is executed.
    for (i in 1..100) {
        when {
            i % 15 == 0 -> println("FrizzBuzz")
            i % 3 == 0 -> println("Frizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    for (i in a..b) {
        when {
            i % 15 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}




