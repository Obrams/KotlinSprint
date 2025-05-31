package lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {
    println("Введите свой год рождения:")
    val userYearBorn = readln().toInt()

    if (userYearBorn != 4) {
        println("Ошибка: введите корректный год (4 цифры)")
        return
    }

    val currentYear = LocalDate.now().year
    val ageCalculation = currentYear - userYearBorn

    if (ageCalculation >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ запрещен!")
    }
}
