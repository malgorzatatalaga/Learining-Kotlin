package learn.hyperskill

import kotlinx.datetime.DateTimePeriod
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.plus

fun main() {

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

fun timeDifference() {
    /*We are going to consider two moments in time that happened on the same day — hours, minutes,
    and seconds. It is known that the second moment happened not earlier than the first one.
    Find how many seconds passed between the two moments.
     */
    val hours1 = readln().toInt()
    val minutes1 = readln().toInt()
    val seconds1 = readln().toInt()
    val hours2 = readln().toInt()
    val minutes2 = readln().toInt()
    val seconds2 = readln().toInt()

    val hoursDifference = hours2 - hours1
    val minutesDifference = minutes2 - minutes1
    val secondsDifference = seconds2 - seconds1 + minutesDifference * 60 + hoursDifference * 3600
    println(secondsDifference)
}

fun isGreater(number1: Int, number2: Int, number3: Int, number4: Int) :Boolean {
    /*
    Write a function called isGreater() that takes four integer numbers and returns true
    if a sum of the first two arguments is greater than a sum of the third and fourth argument.
    Otherwise, return false.
     */
    return number1 + number2 > number3 + number4
}

class Cups(val amount: Int) {
    /*
    There is an amount parameter in the class Cups, which shows the number of cups.
    Override toString() so that when you print an object of the Cups class, the number of cups is printed.
    */
    override fun toString(): String {
        return amount.toString()
    }
}

open class Coffee(val cost: Int, val volume: Int)
class Latte(val milk: String, cost: Int, volume: Int) : Coffee(cost, volume) {
    override fun toString(): String {
        return super.toString() + "; milk=$milk"
    }
}

data class Box(val height: Int, val length: Int, val width: Int) {
//  Modify the data class in order to print only the height, width, and size values.
    var size: Int = height + length + width
    override fun toString(): String {
        return "Box(height=$height, width=$width, size=$size)"
    }
}

fun nextMonth(date: String): String {
    val instant1 = Instant.parse(date)
    val period: DateTimePeriod = DateTimePeriod(0,1)
    return instant1.plus(period, TimeZone.UTC).toString()
}
