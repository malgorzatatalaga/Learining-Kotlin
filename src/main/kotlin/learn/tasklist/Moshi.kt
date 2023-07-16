package learn.tasklist

import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

class Human(var name: String, var age: Int, var friends: Array<String>)

fun main() {
    val human = Human("Mike", 20, arrayOf("Alex", "Valery", "Ann"))
    //To work with Moshi, we need to use the Builder pattern to create the following object:
    val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
    /*
    Next, we need to create an adapter to serialize the Human class and pass it the correct reference.
    This can be done with the Kotlin Classname::class.java feature:
    */
    val humanAdapter = moshi.adapter(Human::class.java)
    println(humanAdapter.toJson(human))

    //Deserializing JSON into Kotlin objects
    val newHumanString = """
    {"name":"John",
    "age":25, 
    "friends":["Mike","Helen"]}""".trimIndent()

    val newHuman = humanAdapter.fromJson(newHumanString)
    /*
    The fromJson method doesn't return a Human, it returns a Human? object.
    This is because it can be nullable (the fromJson method may not recognize the supplied JSON string),
    so ?. is used to access it safely.
     */
    print("New Human: ${newHuman?.name} ${newHuman?.age} ")
    println(newHuman?.friends.contentToString())

    val humanList = listOf(human, newHuman)
    /*
    Because our transformation will involve two classes, Human and List,
    we need to pass them in a ParameterizedType object.
    This approach allows us to store information about both classes together,
    so it can be passed to the adapter for use during deserialization:
     */
    val type = Types.newParameterizedType(List::class.java, Human::class.java)
    val humanListAdapter = moshi.adapter<List<Human?>>(type)
    print(humanListAdapter.toJson(humanList))

    /*
    Having created a suitable adapter by combining the List and Human classes,
    we can use it to convert a JSON string:
     */
    val jsonStr =
        """[{"name":"Nick","age":10,"friends":["Valery"]},
       {"name":"John","age":25,"friends":[]},
       {"name":"Kate","age":40,"friends":[]}]
       """.trimIndent()

    val newHumanList = humanListAdapter.fromJson(jsonStr)
    for (h in newHumanList!!) {
        print(h?.name + " ")
    }
}