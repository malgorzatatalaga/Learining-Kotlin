package learn.documentation

fun main() {
    val time = readLine()?.toInt()
    val workTime = 9..18
    val lunchTime = 13..14
    print(
        time in workTime && time !in lunchTime
    )

//  The sum of integers from a to b:
    var result = 0
    val number1 = readln().toInt()
    val number2 = readLine()!!.toInt()

    for (i in number1..number2) {
        result += i
    }

    println(result)

//  The roots of equation
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (i in 1..1000) {
        if ((a * i * i * i + b * i * i + c * i + d) == 0) {
            println(i)
        }
    }

}