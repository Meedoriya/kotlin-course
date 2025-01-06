package lesson_8

fun main() {

//    val ship1 = Spaceship("ship1", 500)
//    ship1.runSystemDiagnostic()
//    ship1.switchToWarpMode()
//    println()

    val scout1 = Scout("scout1", 1234, 100, 1000)
    scout1.runSystemDiagnostic()
    scout1.switchToWarpMode()
    scout1.runAfterBurner()
    scout1.handleDateFromRadar()
    println(scout1.unmanned)
    println()

    val industrial1 = Industrial("industrial1", 213, 8)
    industrial1.runSystemDiagnostic()
    industrial1.switchToWarpMode()
    industrial1.launchScanningDrones()
    println(industrial1.unmanned)
}

