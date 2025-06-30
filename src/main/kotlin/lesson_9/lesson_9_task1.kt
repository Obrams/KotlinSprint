package lesson_9

fun main() {
    val listOfIngredients = mutableListOf(
        "Квас", "Картофель", "Вареная колбаса", "Яйца", "Редис", "Огурцы",
        "Сметана", "Зелень", "Соль"
    )
    println("В рецепте есть следующие ингредиенты: $listOfIngredients")

    listOfIngredients.forEach {
        println(it)
    }

}