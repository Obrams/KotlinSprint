package lesson_3

fun main() {
    val move = "D2-D4;0"
    val parts = move.split(";", "-")
    val from = parts[0]
    val to = parts[1]
    val moveNumber = parts[2]

    println("Ход из: $from")
    println("Ход в: $to")
    println("Номер хода: $moveNumber")
}
