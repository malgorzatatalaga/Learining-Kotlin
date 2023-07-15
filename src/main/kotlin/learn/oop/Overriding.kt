package learn.oop

class Cups(val amount: Int) {
    /*
    There is an amount parameter in the class Cups, which shows the number of cups.
    Override toString() so that when you print an object of the Cups class, the number of cups is printed.
    */
    override fun toString(): String {
        return amount.toString()
    }
}

open class Coffee(val cost: Int, val volume: Int)
class Latte(val milk: String, cost: Int, volume: Int) : Coffee(cost, volume) {
    override fun toString(): String {
        return super.toString() + "; milk=$milk"
    }
}

data class Box(val height: Int, val length: Int, val width: Int) {
    //  Modify the data class in order to print only the height, width, and size values.
    var size: Int = height + length + width
    override fun toString(): String {
        return "Box(height=$height, width=$width, size=$size)"
    }
}



