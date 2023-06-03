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

    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (word in words) {
        if (word.startsWith("l")) {
            println(word)
        }
    }
}
