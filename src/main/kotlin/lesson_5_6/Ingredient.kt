package lesson_5_6

class Ingredient(val name: String, val weight: Int, val count: Int) {

    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        _isNeedToPrepare: Boolean,
    ) : this(name, weight, count) {

        isNeedToPrepare = _isNeedToPrepare

    }

    init {
        println("Ингредиент $name создан")
    }
}