package lesson_5

fun main() {

    val dish1: Dish = Dish(
        id = 1,
        name = "Egg",
        category = "breakfast",
        ingredients = listOf("яйцо", "помидор", "соль", "перец"),
    )

    val dish2: Dish = Dish(
        id = 2,
        name = "Ramen",
        category = "dinner",
        ingredients = listOf("вермешель", "курица", "вода", "соль", "перец"),
    )

//    println(dish1.name)
//    println(dish1.ingredients)
//    println(dish1.inFavorites)
//    println()
//    println(dish2.name)
//    println(dish2.ingredients)
//    println(dish2.inFavorites)

//    dish1.category = "Dish from eggs"
//    dish2.inFavorites = true
//    println(dish1.category)
//    println(dish2.inFavorites)

    println("Действия для блюда Яичница")
    dish1.addToFavorites()
    println(dish1.inFavorites)
    dish1.startCooking()

    println()

    println("Действия для блюда Суп лапша")
    dish1.addToFavorites()
    println(dish2.inFavorites)
    val ingredientsForSoup = dish2.downloadIngredients()
    println(ingredientsForSoup)
    dish2.removeFromFavorites()
    println(dish2.inFavorites)
}