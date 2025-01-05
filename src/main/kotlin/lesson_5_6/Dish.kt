package lesson_5

class Dish(
    val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false,
) {

    fun addToFavorites() {
        println("Dish $name added to favorites")
        inFavorites = true
    }

    fun removeFromFavorites() {
        println("Dish $name deleted from favorites")
        inFavorites = false
    }

    fun startCooking() {
        println("User started cooking $name")
    }

    fun downloadIngredients(): List<String> {
        return ingredients;
    }
}