package lesson_1

fun main () {
    val secondsCount = 6480

    val hours = secondsCount / 3600
    val minute = (secondsCount % 3600) /60
    val seconds = secondsCount % 60

    println("0$hours:$minute:0$seconds")
}
