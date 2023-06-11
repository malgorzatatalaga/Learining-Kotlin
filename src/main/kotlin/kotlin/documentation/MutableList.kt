package kotlin.documentation

fun main() {
//    Outputting a list
    val southernCross = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
    println(southernCross.joinToString())   //  Acrux, Gacrux, Imai, Mimosa
    println(southernCross.joinToString(" -> "))   //  Acrux -> Gacrux -> Imai -> Mimosa

//    Mutable lists can be joined
    val stars = mutableListOf("Ginan", "Mu Crucis")
    val newList = southernCross + stars
    println(newList.joinToString())    //  Acrux, Gacrux, Imai, Mimosa, Ginan, Mu Crucis

//    Mutable lists can be compared
    val firstList = mutableListOf("result", "is", "true")
    val secondList = mutableListOf("result", "is", "true")
    val thirdList = mutableListOf("result")

    println(firstList == secondList)  //  true
    println(firstList == thirdList)   //  false
    println(secondList != thirdList)  //  true

//    Adding new elements to the list
    val vowels = mutableListOf('a', 'o', 'i', 'e', 'u')
    val intList1 = mutableListOf(1, 2, 3, 4, 5)
    val intList2 = mutableListOf(5, 4, 3, 2, 1)

    vowels += 'y'
    intList1 += intList2

    println(vowels)   // [a, o, i, e, u, y]
    println(intList1) // [1, 2, 3, 4, 5, 5, 4, 3, 2, 1]

//    Other useful functions
//    list.subList(from, to) – creates a smaller list (sublist)
//    The element with the index to is not included.
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    var sublist = mutableListOf<Int>()
    if (numbers.isNotEmpty() && numbers.size >= 4) {
        sublist = numbers.subList(1, 4)
    }
    print(sublist) // [2, 3, 4]

//    list.minOrNull() and list.maxOrNull() – search for the minimum and maximum elements in the list.
    println(numbers.minOrNull()) // 1
    println(numbers.maxOrNull()) // 5

}