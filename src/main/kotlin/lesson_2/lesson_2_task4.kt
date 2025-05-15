package lesson_2

fun main () {
    val crystalCountOre = 7
    val ironCountOre = 11
    val bonus = 20

    val bonusOreCrystal = crystalCountOre * bonus/100
    val bonusOreIron = ironCountOre * bonus/100

    println("Бафф для добытой кристальной руды: $bonusOreCrystal")
    println("Бафф для добытой железной руды: $bonusOreIron")
}
