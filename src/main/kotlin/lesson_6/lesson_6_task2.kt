package lesson_6

fun main() {
    println("Введите количество секунд, которое нужно засечь:")
    val inputSecondUser = readln().toInt()
    Thread.sleep(inputSecondUser * 1000L)
    println("Прошло $inputSecondUser секунд")
}
