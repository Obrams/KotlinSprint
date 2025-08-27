package lesson_15

/*
На форуме есть два типа пользователей – обычные пользователи и администраторы.

Пользователи могут читать форум и писать сообщения.
Администраторы дополнительно могут удалять сообщения и пользователей.

Опиши классы для сущностей пользователей и администраторов, используя абстрактный класс.
У абстрактного класса должны быть соответствующие общие поля и методы.
Действия на форуме отобрази сообщениями в консоль.
 */

abstract class User {
    abstract val userId: Int
    abstract val userName: String
    abstract fun writeMessage()
    abstract fun readMessage()
}

class Admin(
    override val userId: Int,
    override val userName: String,
) : User() {
    override fun readMessage() {
        println("[$userName] читает форум")
    }

    override fun writeMessage() {
        println("[$userName] пишет сообщение")
    }

    fun deleteMessage() {
        println("[$userName] удаляет сообщени")
    }
}

fun main() {
    Admin(1, "Alice").apply {
        readMessage()
        writeMessage()
        deleteMessage()
    }

}