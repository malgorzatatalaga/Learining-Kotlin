package learn.oop

fun main() {
    val bob = Client("Bob", 29, "Male")
    val john = bob.copy(name = "John")
    println(bob)
    println(john)

    val adam = Client("Adam", 21, "Śmigłowiec bojowy")
    println(bob.name)
    println(bob.component1())
    println(bob.age)
    println(bob.component2())
    println(bob.gender)
    println(bob.component3())

    //destructuring declarations
    val (name, age, gender) = bob
    println(name) // Bob
    println(age)  // 29
    println(gender) // Male
}

data class Client(val name: String, val age: Int, val gender: String) {
    var balance: Int = 0

    override fun toString(): String {
        return "Client(name='$name', age=$age, gender='$gender', balance=$balance)"
    }
}