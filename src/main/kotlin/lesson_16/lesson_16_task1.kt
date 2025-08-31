package lesson_16

import kotlin.random.Random

class Cube() {
    private val randomNumber = Random.nextInt(1, 7)

    fun checkRandomNumber() {
        println("Случайное число: $randomNumber")
    }
}

fun main() {
    val cube = Cube()
    cube.checkRandomNumber()

}