package lesson_11

class BabelFish(
    private val coefficient: Int?
) {
    var isTranslated = false

    var nervSignalLevel = 200
        get() = if (coefficient != null) field * coefficient else field
        set(value: Int) {
            field = value
            if (value > 300) {
                isTranslated = true
                println("isTranslated = true")
            }
        }
}