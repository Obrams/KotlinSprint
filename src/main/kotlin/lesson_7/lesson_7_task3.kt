package lesson_7

fun main() {
    println("Введите свое число:")
    val inputUserNumber = readln().toInt()

    for (i in 0..inputUserNumber step 2) {
        print(i)
    }
}