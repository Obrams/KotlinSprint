package lesson_9

import kotlin.collections.sorted

fun main() {
    println("Введите ингредиенты:")
    val userInputIngredients = readln()
    val ingredientsList = userInputIngredients.split(", ")
    val sortedIngredients = ingredientsList.sorted()
    println(sortedIngredients)
}