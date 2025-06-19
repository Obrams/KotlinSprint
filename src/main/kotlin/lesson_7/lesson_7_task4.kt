package lesson_7

fun main() {
    println("Введите количество секунд, которое нужно засечь:")
    val inputUserSecond = readln().toInt()

    for (i in inputUserSecond downTo 1) {
        println("Секунд осталось: $i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}
