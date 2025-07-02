package lesson_10

fun main() {
    println("Бросает игрок")
    val userRoll = rollDice()
    println("У игрока выпало: $userRoll")

    println("Бросает компьютер")
    val computerRoll = rollDice()
    println("У игрока выпало: $computerRoll")

    val resultWin = whoWin(userRoll, computerRoll)
    println(resultWin)

}

fun rollDice(): Int {
    return (1..6).random()
}

fun whoWin(userRoll: Int, computerRoll: Int): String {
    return if (userRoll < computerRoll) {
        "Победила машина"
    } else if (userRoll > computerRoll) {
        "Победило человечество"
    } else {
        "Победила дружба"
    }
}
