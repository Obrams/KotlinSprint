package lesson_10

const val CHARACTER_LIMIT = 4
fun main() {
    println("Введите логин:")
    val userLogin = readln()

    println("Введите пароль:")
    val userPassword = readln()

    println(validateCredentials(userLogin, userPassword))

}

fun validateCredentials(userLogin: String, userPassword: String): String {
    return if (userLogin.length <= CHARACTER_LIMIT && userPassword.length <= CHARACTER_LIMIT) {
        "Добро пожаловать в систему"
    } else {
        "Логин или пароль недостаточно длинные"
    }
}
