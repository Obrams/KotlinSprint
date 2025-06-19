package lesson_7

fun main() {
    println("Введите длину пароля:")
    var inputUserLeghtPassword = readln().toInt()

    while (inputUserLeghtPassword < 6) {
        println("Пароль меньше 6 символов введите еще раз")
        inputUserLeghtPassword = readln().toInt()
    }
    val lowercaseLetters = ('a'..'z')
    val uppercaseLetters = ('A'..'Z')
    val numbers = ('0'..'9')

    val passwordChars = mutableListOf<Char>()
    passwordChars.addAll(
        listOf(
            lowercaseLetters.random(),
            uppercaseLetters.random(),
            numbers.random()
        )
    )

    val allChars = lowercaseLetters + uppercaseLetters + numbers
    for (i in 1..inputUserLeghtPassword - 3) {
        passwordChars.add(allChars.random())

    }
    passwordChars.shuffle()
    val finalPassword = passwordChars.joinToString("")
    println("Ваш новый пароль: $finalPassword")
}
