package lesson_8


fun main() {
    val arrayOfIngredients = arrayOf(
        "Квас", "Картофель", "Вареная колбаса", "Яйца", "Редис", "Огурцы",
        "Сметана", "Зелень", "Соль"
    )
    print("Введите интересующий Вас ингредиент:")
    val inputUserIngredient = readln()

    if (inputUserIngredient.lowercase() in arrayOfIngredients.contentToString().lowercase()) {
        println("Ингредиент $inputUserIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
