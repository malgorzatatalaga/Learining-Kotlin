package learn.oop

fun main() {
    val smartOne = Smartphone("Ericsong")
    smartOne.price = -24
    val smartTwo = Smartphone("iNokhe")
    println(smartTwo.price)
    println(smartOne.price)
    println(smartTwo.price - smartOne.price)

}

class Smartphone(val name: String) {
    var price: Int = -5
        get() {
            return name.length - field
        }
}
