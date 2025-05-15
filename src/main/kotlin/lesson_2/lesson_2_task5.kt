package lesson_2

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow

fun main () {
    val sum = 70000
    val interestRate = 16.7
    val years = 20
    val hardPercent = BigDecimal(sum * (1 + (interestRate / 100)).pow(years.toDouble()))
    val roundedHardPercent = hardPercent.setScale(3, RoundingMode.HALF_UP)

    println("Размер вклада после $years лет и под $interestRate% c cуммой $sum рублей составит: $roundedHardPercent")
}
