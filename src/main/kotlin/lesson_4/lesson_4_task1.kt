package lesson_4

fun main() {
    val totalTables = 13
    val bookedToday = 13
    val bookedTomorrow = 9

    val isAvailableToday = bookedToday < totalTables
    val isAvailableTomorrow = bookedTomorrow < totalTables

    println("[Доступность столиков на сегодня: $isAvailableToday]")
    println("[Доступность столиков на завтра: $isAvailableTomorrow]")

}
