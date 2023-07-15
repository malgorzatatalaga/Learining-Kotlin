package learn.file

import java.io.File

fun main() {
    //Files and Directories
    val outDir = File("outDir")
    println(outDir.exists()) //checks if the file exists
    outDir.mkdir() //creates a directory
    println(outDir.exists())
    println(outDir.isDirectory) //checks if the File is a directory
    val file = outDir.resolve("newFile.txt") //returns a file named String in a directory
    println(file.exists())
    file.createNewFile()
    println(file.exists())
    println(file.isFile)
    println(file.isDirectory)

    val kotlinProjects = File("/Users/gosia/Desktop/KotlinProjects")
    listContent(kotlinProjects)

    /*
    parent - returns a string representation of the parent directory of a file
    or null if this file does not have a parent
    */
    println("Parent: ${kotlinProjects.parent}")
    println(kotlinProjects.parentFile.name)

    fileWalk()

    getDirectory(kotlinProjects)
}

fun getDirectory(kotlinProjects: File) {
    //To find the LeetCode project, we will iterate through the file tree:
    val projects = kotlinProjects.walk()
    projects.maxDepth(1)
    var leetCodeProject: File = projects.first { it.name == "LeetCode" }
    println(leetCodeProject)
    //Another way to get the directory LeetCode is to use the File.listFiles() method
    leetCodeProject = kotlinProjects.listFiles().first { it.name == "LeetCode"}
    println(leetCodeProject)
}

fun listContent(kotlinProjects: File) {
    //Getting directory contents and directory's parent
    val kotlinProjectsListFiles = kotlinProjects.listFiles().map { it.name }
    println(kotlinProjectsListFiles)
}

fun fileWalk() {
    val kotlinPlayground = File("/Users/gosia/Desktop/KotlinProjects/Kotlin-Playground/src/main/kotlin/learn/file")
    /*
   File.walk(direction): FileTreeWalk - Provides the directories and files we can visit in this directory;
   we need to specify how exactly we will iterate (up or down the hierarchy structure)
    */
    kotlinPlayground.walk(FileWalkDirection.TOP_DOWN).forEach { println(it) }
}
