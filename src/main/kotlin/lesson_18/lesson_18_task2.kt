package lesson_18


open class Dice(
    val numberFlat: Int
) {
    open fun throwDice() {
        val result = (1..numberFlat).random()
        println("Бросок совершен: выпало $result (граней: $numberFlat)")
    }
}

class Four : Dice(4)
class Six : Dice(6)
class Eight : Dice(8)

fun main() {
    val diceList: List<Dice> = listOf(Four(), Six(), Eight())
    for (dice in diceList) {
        dice.throwDice()
    }
}