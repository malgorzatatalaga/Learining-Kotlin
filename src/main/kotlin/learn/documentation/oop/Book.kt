package learn.documentation.oop

open class Book(val pages: Int, val author: String, var cost: Float = 0F) {
    fun getFullInfo(): String {
        return "$pages pages, $author author, $$cost cost"
    }
}

class Comics(pages: Int, author: String, cost: Float) : Book(pages, author, cost)

class Booklet(pages: Int, cost: Float) : Book(pages, "", cost) {
    fun getUSDCost(): String {
        return "$$cost cost"
    }

    fun getEuroCost(): String {
        return "€$cost cost"
    }
}

fun isBigBook(book: Book): Boolean {
    return book.pages >= 100
}