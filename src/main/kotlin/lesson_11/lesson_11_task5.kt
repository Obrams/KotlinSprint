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
            println("${author?.userName}: ${message.message}")
        }
    }

    fun createNewMessage(authorId: Int, messageText: String) {
        val userExists = members.any { it.userId == authorId }
        if (userExists) {
            val newMessage = ForumMessage(authorId = authorId, message = messageText)
            messages.add(newMessage)
        }
    }

    fun createNewUser(userName: String): ForumMember {
        val newId = nextUserId++
        val newUser = ForumMember(userId = newId, userName = userName)
        members.add(newUser)
        return newUser
    }
}

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)
