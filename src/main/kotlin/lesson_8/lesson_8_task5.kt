package lesson_8

fun main() {
    println("Сколько ингредиентов вы хотите добавить?")
    val inputNumberIngredient = readln().toInt()
    val arrayOfIngredients = Array(inputNumberIngredient) { "" }

    for (i in arrayOfIngredients.indices) {
        println("Введите ингредиент ${i + 1}:")
        val inputIngredient = readln()
        arrayOfIngredients[i] = inputIngredient
    }
    val resultString = arrayOfIngredients.joinToString(separator = ", ")
    println("Ваш список ингредиентов: $resultString")
}