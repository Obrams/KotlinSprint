package lesson_6

import kotlin.random.Random

fun main() {
    var attempts = 3
    var success = false

    while (attempts > 0 && !success) {
        val num1 = Random.nextInt(1, 9)
        val num2 = Random.nextInt(1, 9)
        val sum = num1 + num2

        println("Решите пример: $num1 + $num2 = ?")
        print("Ваш ответ: ")

        val inputUserNum = readln().toInt()

        if (inputUserNum == sum) {
            success = true
        } else {
            attempts--
            println("Неверно. Осталось попыток: $attempts")
        }
    }

    if (success) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен")
    }
}