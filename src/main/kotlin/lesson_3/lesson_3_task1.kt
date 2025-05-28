package lesson_3

fun main() {
    val name = "Никита"
    val welcomeMessageMorning = ("Добрый день")
    val welcomeMessageEvening = ("Добрый вечер")
    var welcomeMessage = ""

    welcomeMessage = "$welcomeMessageMorning, $name!"
    println(welcomeMessage)

    welcomeMessage = "$welcomeMessageEvening, $name!"
    println(welcomeMessage)
}
