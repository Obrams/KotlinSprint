package lesson_6

fun main() {
    println("Введите количество секунд, которое нужно засечь:")
    val unputSecondUser = readln().toInt()
    var counter = 0

    while (counter <= unputSecondUser) {
        counter++
        Thread.sleep(1000)
    }
    println("Прошло $unputSecondUser секунд")
}
