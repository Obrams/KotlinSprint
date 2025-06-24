package lesson_8

fun main() {
    val arrayUserViews = intArrayOf(12, 45, 67, 89, 44, 534, 6666)
    var totalViews = 0
    for (i in arrayUserViews) {
        totalViews += i
    }
    println("Общее количество просмотров:$totalViews")
}
