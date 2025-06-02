package lesson_5

import kotlin.random.Random

fun main() {

    val secretNumbers = listOf(
        Random.nextInt(0, 42),
        Random.nextInt(0, 42),
        Random.nextInt(0, 42)
    )

    println("Введите три числа от 0 до 42:")
    val userNumbers = listOf(
        readln().toInt(),
        readln().toInt(),
        readln().toInt()
    )

    val matches = secretNumbers.intersect(userNumbers.toSet()).size

    when (matches) {
        3 -> println("Вы выиграли джекпот!")
        2 -> println("У вас 2 совпадения — крупный приз!")
        1 -> println("Одно число угадано — утешительный приз")
        else -> println("Не получилось угадать, еще повезет!")
    }
    println("Правильные числа: $secretNumbers")
}
