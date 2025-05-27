package lesson_2

import java.math.BigDecimal
import kotlin.math.pow

fun main () {
    val sum = 70000
    val interestRate = 16.7
    val years = 20
    val hardPercent = BigDecimal(sum * (1 + (interestRate / PRESENT)).pow(years.toDouble()))
    val roundedHardPercent = "%.3f".format(hardPercent)

    println("Размер вклада после $years лет и под $interestRate% c cуммой $sum рублей составит: $roundedHardPercent")
}
