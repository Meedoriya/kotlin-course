package lesson_8

open class Spaceship(
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false,
) {

    fun switchToWarpMode() {
        println("$name: Переход в warp-режим")
    }

    open fun runSystemDiagnostic() {
        println("$name: Запущена диагностика систем коробля")
    }

}