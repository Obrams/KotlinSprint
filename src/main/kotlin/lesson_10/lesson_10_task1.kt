package lesson_10

fun main() {
    println("Бросает игрок")
    val userRoll = rollDice()
    println("У игрока выпало: $userRoll")

    println("Бросает компьютер")
    val computerRoll = rollDice()
    println("У игрока выпало: $computerRoll")

    val resultWin = getGameResult(userRoll, computerRoll)
    println(resultWin)

}

fun rollDice(): Int = (1..6).random()

fun getGameResult(userRoll: Int, computerRoll: Int): String {
    return when {
        userRoll < computerRoll -> "Победила машина"
        userRoll > computerRoll -> "Победило человечество"
        else -> "Победила дружба"
    }
}
