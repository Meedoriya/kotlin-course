package lesson_9

abstract class SpaceShuttle : Movable, Shootable {

    abstract val tankSize: Int
    abstract fun runDiagnostic()
}

class Upsilon(override val tankSize: Int) : SpaceShuttle() {
    override fun runDiagnostic() {
        println("Диагностика запущена")
    }

    override fun prepareForTakeOff() {
        println("dsds")
    }

    override fun prepareForLanding() {
        println("cscs")
    }

    override fun startShooting() {
        println("ohoh")
    }

    override fun reloadGuns() {
        println("vhvh")
    }
}