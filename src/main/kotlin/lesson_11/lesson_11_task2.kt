package lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {
    fun printInfoUser() {
        println("Информация о пользователе")
        println("ID: $id")
        println("Логин: $login")
        println("Email: $email")
        if (bio == null) {
            println("Информация о себе не указана")
        } else {
            println("Информация о себе: $bio")
        }
    }

    fun inputBio() {
        println("Введите данные о себе:")
        bio = readLine()
    }

    fun checkPassword() {
        println("Введите свой пароль:")
        val inputPassword = readln()
        if (inputPassword == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль успешно изменен")
        } else {
            println("Вы ввели неправильный пароль")
        }
    }
}

fun main() {
    val user2 = User2(
        id = 2,
        login = "BigBoss",
        password = "BigBoss228",
        email = "big@mail.ru",
        bio = "о себе",
    )
    user2.inputBio()
    user2.checkPassword()
    user2.printInfoUser()
}
