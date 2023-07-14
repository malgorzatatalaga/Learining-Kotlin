package learn.documentation.standardIO

fun main() {
    val string1 = String.format("%s %s", "Hello", "World")
    println(string1)

    //An alternative syntax with the same result:
    val string2 = "%s %s".format("Hello", "World")
    println(string2)

    //Uppercase:
    val string = String.format("%S %S", "Hello", "World")
    println(string)

    /*
    Changing the order of arguments
    You can change the order using parameters for it: %n\$s ,
    where n represents the number of the parameter that we want to insert
    into the result String and s is the parameter of the type String.
     */
    val str1 = "Kotlin"
    val str2 = "the best language"
    var str = String.format("%1\$s is %2\$s", str1, str2)
    println(str) // // Kotlin is the best language
    str = String.format("%2\$s is %1\$s", str1, str2)
    println(str) // the best language is Kotlin

    /*
    Width and justification
    The %s specifier can be modified in order to define the space an argument can occupy and its alignment.
    If N is a positive integer, then %Ns denotes that the argument should occupy the space of N characters
    (width indicator). In case N is smaller than the string length, the string will occupy the space
    equal to its length.
    By default, a string is right-aligned within its available space.
     */
    val string3 = "cats"
    for (n in 1..15) println("%${n}s".format(string3))

    //For left justification, %-Ns should be used.
    val s1 = String.format("%8s %8s", "Hello", "World")
    println(s1)

    val s2 = String.format("%-8s %-8s", "Hello", "World")
    println(s2)

    val int1 = 1234
    val int2 = -4567

    //Formatting integers
    println(String.format("%d", int1))       //1234
    println(String.format("%8d", int1))      //    1234
    println(String.format("%-8d", int1))     //1234
    println(String.format("%+d", int1))      //+1234

    println(String.format("%+d", int2))      //-4567
    println(String.format("%09d", int1))     //000001234
    println(String.format("%,10d", int1))    //     1,234
    println(String.format("%+,010d", int1))  //+00001,234

    println(String.format("%-+,10d", int1))  //+1,234
    println(String.format("% d", int1))      // 1234
    println(String.format("% d", int2))      //-4567
    println(String.format("%(d", int2))      //(4567)
}