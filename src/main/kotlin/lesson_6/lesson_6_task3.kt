package lesson_6

fun main() {
    println("Введите количество секунд, которое нужно засечь:")
    val inputSecondUser = readln().toInt()

    var secondsLeft = inputSecondUser

    while (secondsLeft > 0) {
        Thread.sleep(1000)
        println("Осталось секунд: $secondsLeft")
        secondsLeft--
    }
    println("Время вышло")
}
