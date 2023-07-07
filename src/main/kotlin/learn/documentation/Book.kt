package learn.documentation

fun main() {
    val spidermanBook = Comics(60, "The Universe", 8.99F)
    println(spidermanBook.getFullInfo())

    val centralBooklet = Booklet(5, 0.14F)
    println(centralBooklet.getUSDCost())

    println(isBigBook(spidermanBook))
    println(isBigBook(centralBooklet))
}

fun isBigBook(book: Book): Boolean {
    return book.pages >= 100
}

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