package lesson_9

fun main() {
    val ingredientsList = mutableListOf<String>()
    for (i in 1..5) {
        println("Введите ингредиенты:")
        val inputUserIngredient = readln()
        ingredientsList.add(inputUserIngredient)
    }
    val uniqueSortedList = ingredientsList.toSet().sorted().toMutableList()
    val firstIngredient = uniqueSortedList[0]
    uniqueSortedList[0] = firstIngredient.replaceFirstChar { it.titlecase() }
    println(uniqueSortedList.joinToString(", "))
}
