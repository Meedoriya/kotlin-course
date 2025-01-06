package lesson_9

interface Movable {

    fun startEngine() {
        println("Двигатель запущен")
    }

    fun prepareForTakeOff()
    fun prepareForLanding()
}