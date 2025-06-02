package lesson_5

const val USER_NAME = "Zaphod"
const val USER_PASSWORD = "PanGalactic"

fun main() {
    println("Введите данные для авторизации в систему:")
    val inputUserName = readln()

    if (inputUserName != USER_NAME) {
        println("Такого пользователя не существует.")
        println("Программа завершена.")
        return
    }
    val inputUserPassword = readln()

    if (inputUserPassword != USER_PASSWORD) {
        println("Неверный пароль. Вход запрещён.")
        return
    } else {
        println(
            """
        [вздыхает...] Ваши данные проверены, и, к сожалению, они верны...
        Пользователь "$USER_NAME", вам разрешено входить на борт корабля "Heart of Gold".
        Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов...
        [меланхолический вздох] Надеюсь, вам понравится пребывание здесь больше, чем мне.
        """.trimIndent()
        )
    }

}
