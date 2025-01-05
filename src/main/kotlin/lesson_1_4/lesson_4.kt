fun main() {
    printNameAndAge(userName = getName(), userAge = getAge())
}

fun getName() : String? = readln()

fun getAge() : Int? = readln()?.toInt()

//fun getName() : String? {
//    println("Write your name:")
//    return readln()
//}

//fun getAge() : Int? {
//    println("Write your age: ")
//    return readln()?.toInt()
//}

fun printNameAndAge(userName: String?, userAge: Int?) {
    println("Information about user: $userName, $userAge age")
}