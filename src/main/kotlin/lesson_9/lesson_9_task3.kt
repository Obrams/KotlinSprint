package lesson_9

fun main() {
    val listOfIngredientsRecipe = listOf(2, 50, 15)
    println("На сколько порций приготовить?")
    val portions = readln().toInt()
    val newListCountIngredients = listOfIngredientsRecipe.map {
        it * portions
    }
    println(
        "На $portions порций вам понадобится: яиц – ${newListCountIngredients[0]}, " +
                "молока – ${newListCountIngredients[1]}, " +
                "сливочного масла – ${newListCountIngredients[2]}"
    )
}