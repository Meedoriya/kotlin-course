package lesson_1_4

fun main() {

    //диапазоны (интервалы)

    val range1: IntRange = 42..442
    val range2: IntRange = 44 until 442
    val range3: LongRange = 42L..442
    val range4: CharRange = 'a'..'z'
    val range5: ClosedFloatingPointRange<Double> = 42.1..442.1
    val range6: ClosedFloatingPointRange<Double> = 42.1..442.1
    val range7: IntProgression = 42..442 step 2
    val range8 = 442 downTo 42 step 2

    // in, in

    val a = 52 in range1
    val b = 52 !in range1
//    println(a)
//    println(b)

    // for
    // break, continue, return

    for (i in 5 downTo 1) {
        if (i == 3) {
//            println("User tap the button \"Skip\"")
//            break
//            println("i == 3, i не будет распечатана")
//            continue
            return
        }
        println("Advertisement ends in $i")
        Thread.sleep(1000)
    }

    println("Keep working out of the loop")

//    for (i in range2 step 8) {
//        println(i)
//    }
}