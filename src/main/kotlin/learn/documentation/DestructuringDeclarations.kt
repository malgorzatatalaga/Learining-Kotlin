package learn.documentation

fun main() {
    //with data class
    val anonym = UserN("Anonym", 999, false)
    val (userName, userAge, isAdmin) = anonym
    println(userName)
    println(userAge)
    println(isAdmin)

    //without data class
    checkIsAdmin(UserClass("Kaja", 21, true))
}

data class Comment(val id: Int, val body: String, val author: String)

fun printComments(commentsData: MutableList<Comment>){
    //omitting id
    for ((_, body, author) in commentsData) {
        println("Author: $author; Text: $body")
    }
}

data class UserN(val name: String, val age: Int, val isAdmin: Boolean)

class UserClass(val name: String, val age: Int, val isAdmin: Boolean){
    operator fun component1(): String = name
    operator fun component2(): Int = age
    operator fun component3(): Boolean = isAdmin
}

// now we can use default destructuring syntax
fun checkIsAdmin(suspiciousUser: UserClass) {
    // destructuring
    val (name, age, isAdmin) = suspiciousUser

    if (isAdmin)
        println("Have a nice day!")
    else
        println("Sorry, you should not be here.")
}
