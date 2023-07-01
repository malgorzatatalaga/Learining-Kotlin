package learn.hyperskill

fun main() {
    // we can use it to get default values when the variable is null
    var x: String? = null
    x = x ?: "Hello"
    println(x) // "Hello"

    val age: Int? = null
    val name: String = "Bob"
    val nickname: String? = null
    val length: Int = nickname?.length ?: 0
    println("$age ${name.length} $length")

    val line = readLine() ?: throw IllegalStateException()
    println("Elvis says: $line")

    createAEuphoniousWord()
}


fun makeAnException(): Nothing {
    throw Exception("I'm an exception!")
}

fun stringException() {
    val index = readln().toInt()
    val word = readln()
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
    // we can throw exceptions in the right part
    val length2: Int = name?.length
        ?: throw Exception("The name is null")
}

fun compareCaseInsensitive() {
    val s1 = readln().toLowerCase()
    val s2 = readln().toLowerCase()

    if (s1 == s2) println(true) else println(false)
}

// getting substrings
fun exchange() {
    val s1 = readln()
    val first = s1.first()
    val last = s1.last()
    val s2 = s1.replace(last, first)
    println(s2.replaceFirst(first, last))
}

// processing strings
fun theLuckyTicket() {
    val number = readln()
    var list = number.split("")
    // calculating the sum of the first three digits
    var firstSum = 0
    for (i in 1..3) {
        val digit = list[i].toInt()
        firstSum += digit
    }

    // calculating the sum of the last three digits
    var secondSum = 0
    for (i in list.size - 2 downTo list.size - 4) {
        val digit = list[i].toInt()
        secondSum += digit
    }

    if (firstSum == secondSum) println("Lucky") else println("Regular")
}

fun createAEuphoniousWord() {
    /*
    A word is considered euphonious if it doesn't have three or more vowels or consonants in a row.
    Otherwise, it is considered discordant.
    */
    val word = readln()
    val vowels = listOf('a', 'o', 'e', 'i', 'u', 'y')
    var vowelCount = 2
    var consonantCount = 2
    var result = 0
    for (i in 0..word.length - 3) {
        if (vowels.containsAll(listOf(word[i], word[i + 1], word[i + 2]))) vowelCount += 1
        else if (!vowels.contains(word[i]) && !vowels.contains(word[i + 1]) && !vowels.contains(word[i + 2])) {
            consonantCount += 1
        } else {
            vowelCount = 2
            consonantCount = 2
        }
        if (consonantCount >= 3) {
            result++
            consonantCount = 1
        }
        if (vowelCount >= 3) {
            result++
            vowelCount = 1
        }
    }
    println(result)
}


