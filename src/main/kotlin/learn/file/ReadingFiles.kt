package learn.file

import java.io.File
import java.io.FileNotFoundException

fun main() {
    readAndPrintTextFile()
    wordsWithNumbers()
    theLongestWordInFile()
}

fun wordsWithNumbers() {
    val fileName = "src${File.separator}words_with_numbers.txt"
    val listOfStrings = mutableListOf<String>()
    File(fileName).forEachLine { listOfStrings.add(it) }
    var countLines = 0
    for (line in listOfStrings) {
        var countChars = 0
        for (char in line) {
            if (char.isDigit()) {
                countChars++
            }
        }
        if (countChars == line.length) {
            countLines++
        }
    }
    println(countLines)
}
fun readAndPrintTextFile() {
    try {
        val fileName = "src${File.separator}text.txt"
        val file = File(fileName)
        val lines = file.readText()
        println(lines)

        val stringList = File(fileName).readLines()

        for (line in stringList){
            println(line)
        }

        //recommended way of reading large files
        File(fileName).forEachLine { println(it) }

    } catch (e: FileNotFoundException) {
        println("File not found")
    }
}

fun theLongestWordInFile() {
    val fileName = "src${File.separator}words_sequence.txt"
    val listOfStrings = mutableListOf<String>()
    File(fileName).forEachLine { listOfStrings.add(it) }
    var maxLength = 0
    for (line in listOfStrings) {
        if (line.length > maxLength) {
            maxLength = line.length
        }
    }
    println(maxLength)
}