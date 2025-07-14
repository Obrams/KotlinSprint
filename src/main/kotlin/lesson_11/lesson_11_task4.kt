package lesson_11

class RecipeCategory(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val description: String,
) {

}

class Recipe(
    val id: Int,
    val name: String,
    val imageUrl: String,
) {

}

class Ingredient(
    val id: Int,
    val name: String,
    val category: String,
    val imageUrl: String,
) {

}
