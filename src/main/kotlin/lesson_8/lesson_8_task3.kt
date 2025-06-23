package lesson_8


fun main() {
    val arrayOfIngredients = arrayOf(
        "Квас", "Картофель", "Вареная колбаса", "Яйца", "Редис", "Огурцы",
        "Сметана", "Зелень", "Соль"
    )
    print("Введите интересующий Вас ингредиент:")
    val inputUserIngredient = readln()
    val isFoundIngredients =
        arrayOfIngredients.any { ingredient -> inputUserIngredient.lowercase() == ingredient.lowercase() }


    if (isFoundIngredients) {
        println("Ингредиент $inputUserIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
