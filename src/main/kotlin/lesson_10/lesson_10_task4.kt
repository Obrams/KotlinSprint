package lesson_10

fun main() {
    playRound()
}

fun playRound() {
    var userWins = 0
    while (true) {
        println("Бросает игрок")
        val userRoll = rollDices()
        println("У игрока выпало: $userRoll")

        println("Бросает компьютер")
        val computerRoll = rollDices()
        println("У компьютера выпало: $computerRoll")

        val resultWin = getGameResults(userRoll, computerRoll)
        println(resultWin)

        if (userRoll > computerRoll) {
            userWins++
        }

        println("Хотите еще?")
        val userAcept = readln().lowercase()

        if (userAcept != "да") {
            break
        }

    }
    println("Вы выиграли $userWins партий!")
}

fun rollDices(): Int = (1..6).random()

fun getGameResults(userRoll: Int, computerRoll: Int): String {
    return when {
        userRoll < computerRoll -> "Победила машина"
        userRoll > computerRoll -> "Победило человечество"
        else -> "Победила дружба"
    }
}
