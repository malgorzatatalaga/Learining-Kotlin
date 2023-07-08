package learn.documentation

fun main() {
    println(BerryHolder(10))

    val user = User(1, "uncle_bob", "rmartin@objectmentor.com")
    println(user)

    val author1 = Author(1, "uncle_bob",
        "rmartin@objectmentor.com",
        "\n1.\"Clean Code: A Handbook of Agile Software Craftsmanship\" \n2.\"Agile Software Development: Principles, Patterns and Practices\"")

    val author2 = Author(2, "ltlst",
        "leotolstoy@mail.com",
        "\n1.\"Anna Karenina\" \n2.\"The Death of Ivan Ilyich\" \n3.\"War and Peace\"")

    println(author1)
    println()
    println(author2)
}

class BerryHolder(val weight: Int) {
    override fun toString(): String {
        return weight.toString()
    }
}

open class User(val id: Int, val login: String, val email: String) {
    override fun toString(): String {
        return "User{id=$id, login=$login, email=$email}"
    }
}

//Overriding toString(): Inheritance

class Author(id: Int, login: String, email: String, val books: String): User(id, login, email) {
    override fun toString(): String {
        return "Author: ${super.toString()};\nBooks: $books"
    }
}



