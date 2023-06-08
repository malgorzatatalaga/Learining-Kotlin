import kotlin.math.abs

fun main() {

}

fun isVowel(letter: Char): Boolean {
    return letter.equals('A') || letter.equals('E') || letter.equals('I') || letter.equals('O') || letter.equals('U') ||
            letter.equals('a') || letter.equals('e') || letter.equals('i') || letter.equals('o') || letter.equals('u')
}

fun getLastDigit(number: Int): Int {
    return abs(number % 10)
}