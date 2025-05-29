package lesson_5

fun main() {
    val num1 = (1..100).random()
    val num2 = (1..100).random()

    println("Сложите $num1 и $num2 введите их сумму")
    val sum = readln().toInt()
    if (sum == num1 + num2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
