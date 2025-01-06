package lesson_7

fun main() {

    //NullPointerException (NPE)
    //null

    val nullableString: String? = null
    val nonNullableString: String = "some string"

//    if (nullableString != null) println(nullableString.length)
//    else println("Переменная хранит null")

//    println(nullableString?.length)
//    print(nonNullableString.length)

    val nullableLine: String? = readln()

    val stringLength: Int = nullableString?.length ?: 999
//    println(stringLength)

    val stringLength1: Int = nullableString!!.length

}