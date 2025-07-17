package lesson_11

class RecipeCategory(
    val id: Int,
    val title: String,
    val imageUrl: String,
    val description: String,
    val recipes: List<Recipe>,
)

class Recipe(
    val id: Int,
    val title: String,
    val imageUrl: String,
    val ingredients: List<Ingredient>,
    val methodOfPreparation: List<String>,
)

class Ingredient(
    val id: Int,
    val title: String,
    val count: Int,
    val unit: String,
    val category: String,
    val imageUrl: String,
)
