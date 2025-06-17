package lesson_7

import kotlin.random.Random

fun main() {
    while (true) {
        val code = Random.nextInt(1000, 10000)
        println("Ваш код авторизации: $code")

        print("Введите код для авторизации: ")
        val userInput = readln().toInt()

        if (userInput == code) {
            println("Добро пожаловать!")
            break
        } else {
            println("Код неверный. Пробуем ещё раз.\n")
        }
    }
}