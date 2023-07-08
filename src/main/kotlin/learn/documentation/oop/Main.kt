package learn.documentation.oop

class Main {
    fun main() {
        val transport = Transport(1000)
        val ship = Ship(2000, "marine")
        println(transport.getFullInfo())
        println(ship.getFullInfo())
        getTransportInfo(transport)
        /* The getTransportInfo() function works well with any open function of the
        Transport class and its child.
         */
        getTransportInfo(ship)

        val spidermanBook = Comics(60, "The Universe", 8.99F)
        println(spidermanBook.getFullInfo())

        val centralBooklet = Booklet(5, 0.14F)
        println(centralBooklet.getUSDCost())

        println(isBigBook(spidermanBook))
        println(isBigBook(centralBooklet))
    }
}