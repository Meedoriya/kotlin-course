package lesson_8

class Scout(
    name: String,
    speed: Int,
    val radarRange: Int,
    val afterBurnerSpeed: Int,
) : Spaceship(name, speed) {

    fun handleDateFromRadar() {
        println("$name: обработка данных с радара")
    }

    fun runAfterBurner() {
        println("$name: форсаж запущен")
    }
}