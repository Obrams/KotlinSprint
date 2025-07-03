package lesson_10

fun main() {
    println("Введите длину пароля:")
    val inputUserLeghtPassword = readln().toInt()

    val password = generatePassword(inputUserLeghtPassword)
    println("Ваш новый пароль: $password")

}

fun generatePassword(inputUserLeghtPassword: Int): String {

    val specialChar = "!\"#\$%&'()*+,-./ "
    val numbers = ('0'..'9').joinToString("")

    var passwordChar = ""

    for (i in 0 until inputUserLeghtPassword) {
        if (i % 2 == 0) {
            passwordChar += numbers.random()
        } else {
            passwordChar += specialChar.random()
        }
    }
    return passwordChar
}
