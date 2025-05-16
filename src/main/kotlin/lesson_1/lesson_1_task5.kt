package lesson_1

const val FIX_MINUTE = 60

fun main () {
    val secondsCount = 6480

    val hours = secondsCount / (FIX_MINUTE * FIX_MINUTE)
    val minutes = (secondsCount % 3600) /FIX_MINUTE
    val seconds = secondsCount % FIX_MINUTE
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(formattedTime)
}
