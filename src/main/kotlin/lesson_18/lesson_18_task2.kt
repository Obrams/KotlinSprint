package lesson_18


open class Dice(

) {
    open val numberFlat: Int = 0
    open fun throwDice() {
        val result = (1..numberFlat).random()
        println("Бросок совершен: выпало $result (граней: $numberFlat)")
    }
}

class Four : Dice() {
    override val numberFlat = 4
}

class Six : Dice() {
    override val numberFlat = 6

}

class Eight : Dice() {
    override val numberFlat = 8

}

fun main() {
    val diceList: List<Dice> = listOf(Four(), Six(), Eight())
    for (dice in diceList) {
        dice.throwDice()
    }
}