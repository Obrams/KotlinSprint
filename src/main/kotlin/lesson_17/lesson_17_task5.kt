package lesson_17

class User(
    private val _login: String,
    private val _password: String
) {
    var login = _login
        set(value) {
            field = value
            println("Логин успешно изменен")
        }
    var password = _password
        set(value) {
            field == field
            println("Вы не можете изменить пароль")
        }
        get() = "*".repeat(_password.length)
}

fun main() {
    val user = User("Login", "Password")
    user.login = "Новый логин"
    user.password = "Новый пароль"
    println(user.password)
}