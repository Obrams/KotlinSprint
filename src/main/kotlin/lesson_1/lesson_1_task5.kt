package lesson_1

const val FIX_MINUTE = 60

fun main () {
    val secondsCount = 6480
    val secondsFix = FIX_MINUTE * FIX_MINUTE
    val hours = secondsCount / (secondsFix)
    val minutes = (secondsCount % secondsFix) /FIX_MINUTE
    val seconds = secondsCount % FIX_MINUTE
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(formattedTime)
}
