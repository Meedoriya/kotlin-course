package lesson_11

fun main() {

    val fish = BabelFish(null)

    println("old value: ${fish.nervSignalLevel}")
//    println("old value: ${fish.isTranslated}")
//    fish.nervSignalLevel = 12321
//    println("new value: ${fish.nervSignalLevel}")
//    println("new value: ${fish.isTranslated}")

    val fish2 = BabelFish(2)
    println("old value: ${fish2.nervSignalLevel}")

    val fish3 = BabelFish(21)
    println("old value: ${fish3.nervSignalLevel}")
}