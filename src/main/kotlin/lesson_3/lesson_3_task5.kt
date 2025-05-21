package lesson_3

fun main() {
    val move = "D2-D4;0"
    val parts = move.split(";")
    val fromTo = parts[0].split("-")
    val from = fromTo[0]
    val to = fromTo[1]
    val moveNumber = parts[1]

    println("Ход из: $from")
    println("Ход в: $to")
    println("Номер хода: $moveNumber")
}
