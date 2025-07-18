package lesson_11


fun main() {
    val myForum = Forum()
    val userAnna = myForum.createNewUser("Анна")
    val userBoris = myForum.createNewUser("Борис")

    myForum.createNewMessage(userAnna.userId, "Всем привет! Это мое первое сообщение.")
    myForum.createNewMessage(userBoris.userId, "Привет, Анна! Рад тебя видеть на форуме.")
    myForum.createNewMessage(userAnna.userId, "Взаимно! Какие планы на выходные?")
    myForum.createNewMessage(userBoris.userId, "Думаю пойти в кино. А ты?")

    myForum.printThread()
}

class Forum {
    private var nextUserId = 1
    private val members = mutableListOf<ForumMember>()
    private val messages = mutableListOf<ForumMessage>()

    fun printThread() {
        messages.forEach { message ->
            val author = members.find { it.userId == message.authorId }
            if (author != null) {
                println("${author.userName}: ${message.message}")
            } else {
                println("Неизвестный автор: ${message.message}")
            }
        }

    }

    fun createNewMessage(authorId: Int, messageText: String) {
        val userExists = members.any { it.userId == authorId }
        if (userExists) {
            val newMessage = ForumMessage.Builder()
                .authorId(authorId)
                .message(messageText)
                .build()
            messages.add(newMessage)
        } else {
            println("Ошибка: Пользователь с ID $authorId не найден. Сообщение не создано.")
        }
    }

    fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember.Builder()
            .userId(nextUserId)
            .userName(userName)
            .build()

        members.add(newUser)
        nextUserId++
        return newUser

    }
}


class ForumMember private constructor(
    val userId: Int,
    val userName: String,
) {
    class Builder {
        private var userId: Int = 0
        private var userName: String = ""
        fun userId(id: Int) = apply { userId = id }

        fun userName(name: String) = apply { userName = name }

        fun build(): ForumMember {
            return ForumMember(userId, userName)
        }

    }
}

class ForumMessage private constructor(
    val authorId: Int,
    val message: String,
) {
    class Builder {
        private var authorId: Int = 0
        private var message: String = " "
        fun authorId(id: Int) = apply { authorId = id }

        fun message(text: String) = apply { message = text }

        fun build(): ForumMessage {
            return ForumMessage(authorId, message)
        }
    }
}
