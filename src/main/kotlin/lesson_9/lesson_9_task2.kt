package lesson_9

fun main() {
    val listBaseIngredients = mutableListOf(
        "Картофель", "Вареная колбаса", "Яйца"
    )
    println("В рецепте есть базовые ингредиенты: $listBaseIngredients")
    println("Желаете добавить еще?")
    val inputUserAnswer = readln()

    if (inputUserAnswer.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val inputUserIngredient = readln()
        listBaseIngredients.add(inputUserIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $listBaseIngredients")
    } else {
        println("Хорошо, готовим только из базовых")
    }
}
