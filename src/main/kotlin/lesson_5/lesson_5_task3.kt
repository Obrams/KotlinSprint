package lesson_5

const val WINNER_NUMBER_ONE = 30
const val WINNER_NUMBER_TWO = 11

fun main() {
    print("Введите первое число: ")
    val inputNum1 = readln().toInt()

    print("Введите второе число: ")
    val inputNum2 = readln().toInt()

    if (inputNum1 !in 0..42 || inputNum2 !in 0..42) {
        println("Ошибка: введите числа от 0 до 42.")
        return
    }

    when {
        (inputNum1 == WINNER_NUMBER_ONE && inputNum2 == WINNER_NUMBER_TWO) ||
                (inputNum1 == WINNER_NUMBER_TWO && inputNum2 == WINNER_NUMBER_ONE) -> {
            println("Поздравляем! Вы выиграли главный приз!")
        }

        inputNum1 == WINNER_NUMBER_ONE || inputNum1 == WINNER_NUMBER_TWO ||
                inputNum2 == WINNER_NUMBER_ONE || inputNum2 == WINNER_NUMBER_TWO -> {
            println("Вы выиграли утешительный приз!")
        }

        else -> {
            println("Неудача!")
            println("Правильные числа: $WINNER_NUMBER_ONE и $WINNER_NUMBER_TWO")
        }
    }
}