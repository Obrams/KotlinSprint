package lesson_4

fun main() {
    val day = 5
    val isUpperBodyDay = day % 2 == 1
    val isLowerBodyDay = !isUpperBodyDay
    println(
        """
        Упражнения для рук:    $isUpperBodyDay
        Упражнения для ног:    $isLowerBodyDay
        Упражнения для спины:  $isLowerBodyDay
        Упражнения для пресса: $isUpperBodyDay
        """.trimIndent()
    )
}
