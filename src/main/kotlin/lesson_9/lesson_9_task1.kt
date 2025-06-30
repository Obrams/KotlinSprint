package lesson_9

fun main() {
    val arrayOfIngredients = mutableListOf(
        "Квас", "Картофель", "Вареная колбаса", "Яйца", "Редис", "Огурцы",
        "Сметана", "Зелень", "Соль"
    )
    println("В рецепте есть следующие ингредиенты: $arrayOfIngredients")

    arrayOfIngredients.forEach {
        println(it)
    }

}