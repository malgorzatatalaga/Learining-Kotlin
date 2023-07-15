package learn.file

import java.io.File

fun main() {
    val pathToFile = "src${File.separator}text.txt"
    val createANewFile = "src${File.separator}newTextFile.txt"

    val textToFile = "Hello"
    val text = "\nAdding new lines to the file"

    File(pathToFile).writeText(textToFile)//overrides the current content of the file
    File(pathToFile).appendText(text) //adds text to an existing file
    File(createANewFile).writeText(textToFile) //creates a new file

    //current directory
    val workingDirectory = System.getProperty ("user.dir")
    println(workingDirectory)
}
