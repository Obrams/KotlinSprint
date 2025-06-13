package lesson_6

fun main() {
    val randomNumber = (1..9).random()
    var attemptsLeft = 5

    while (attemptsLeft > 0) {
        println("Угадайте число от 1 до 9:")
        val inputUserNumber = readln().toInt()
        if (inputUserNumber == randomNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            attemptsLeft--
            if (attemptsLeft > 0) {
                println("Неверно! Осталось попыток: $attemptsLeft")
            }
        }
        if (attemptsLeft == 0) {
            println("Было загадано число $randomNumber")
        }
    }
}