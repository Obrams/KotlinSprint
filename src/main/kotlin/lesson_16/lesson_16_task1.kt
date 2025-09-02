package lesson_16

class Cube() {
    private val randomNumber = (1..6).random()

    fun checkRandomNumber() {
        println("Случайное число: $randomNumber")
    }
}

fun main() {
    val cube = Cube()
    cube.checkRandomNumber()

}