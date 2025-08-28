package lesson_15

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

    fun deleteMessage(messageId: Int) {
        println("[$userName] удаляет сообщени")
    }
}

class RegularUser(
    override val userId: Int,
    override val userName: String,
) : User() {
    override fun writeMessage() {
        println("[$userName] читает форум")
    }

    override fun readMessage() {
        println("[$userName] пишет сообщение")
    }
}

fun main() {
    Admin(1, "Alice Admin").apply {
        readMessage()
        writeMessage()
        deleteMessage(10)
    }
    RegularUser(2, "Nikita").apply {
        readMessage()
        writeMessage()
    }
}