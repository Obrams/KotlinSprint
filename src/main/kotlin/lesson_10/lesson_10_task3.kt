package lesson_10

fun main() {
    println("Введите длину пароля:")
    val passwordLength = readln().toInt()

    val password = generatePassword(passwordLength)
    println("Ваш новый пароль: $password")

}

fun generatePassword(passwordLength: Int): String {

    val specialChar = ' '..'/'
    val numbers = 0..9

    var passwordChar = ""

    for (i in 0 until passwordLength) {
        passwordChar += if (i % 2 == 0) {
            numbers.random()
        } else {
            specialChar.random()
        }
    }
    return passwordChar
}
