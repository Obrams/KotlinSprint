package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf(
        "Квас", "Картофель", "Вареная колбаса", "Яйца", "Редис", "Огурцы",
        "Сметана", "Зелень", "Соль"
    )
    println("Ваши ингредиенты:${arrayOfIngredients.contentToString()}")

    println("Какой элемент Вы хотите изменить?")
    val ingredientToReplace = readln().lowercase()

    val index = arrayOfIngredients.indexOfFirst { it.equals(ingredientToReplace, ignoreCase = true) }

    if (index != 1) {
        println("На какой элемент хотите выполнить замену?")
        val newIngredient = readln().lowercase()
        arrayOfIngredients[index] = newIngredient
        println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.contentToString()}")
    } else {
        println("Такого элемента нет")
    }
}
