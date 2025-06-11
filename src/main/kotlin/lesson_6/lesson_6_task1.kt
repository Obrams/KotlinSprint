package lesson_6

fun main() {
    println("Регистрация пользователя")

    println("Ввод логина:")
    val userLogin = readln()

    println("Ввод пароля:")
    val passwordLogin = readln()

    println("Регистрация прошла успешно $userLogin")

    do {
        println("Авторизация")

        println("Ввод логина:")
        val inputLogin = readln()

        println("Ввод пароля:")
        val inputPassword = readln()

        if (inputLogin == userLogin && inputPassword == passwordLogin) {
            println("Авторизация прошла успешно")
            break
        } else {
            println("Неверный логин или пароль! Попробуйте снова.")
        }
    } while (true)
}
