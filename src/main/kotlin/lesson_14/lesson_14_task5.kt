package lesson_14

open class Chat(
    val chatMessage: MutableList<Message> = mutableListOf()
) {
    var nextId = 1

    fun addMessage(text: String, author: String) {
        val message = Message(nextId, text, author)
        chatMessage.add(message)
        nextId++
        println("Количество сообщений:$nextId")
    }

    fun addThreadMessage(parentMessageId: Int, text: String, author: String) {
        val parent = chatMessage.find { it.id == parentMessageId }
        if (parent == null) {
            println("Родительское сообщение не найдено")
            return
        } else {
            val childMes = ChildMessage(
                parentMessageId = parentMessageId,
                id = nextId,
                text = text,
                author = author
            )
            chatMessage.add(childMes)
            nextId++
        }
    }

    fun printChat() {
        val parents = chatMessage.filter { it !is ChildMessage }
        val child = chatMessage.filterIsInstance<ChildMessage>()
        val groupChild = child.groupBy { it.parentMessageId }
        for (parent in parents) {
            println("${parent.author}: ${parent.text}")
            val replies = groupChild[parent.id]
            if (replies != null) {
                for (child in replies) {
                    println("\t${child.author}: ${child.text}")
                }
            }
        }
    }
}

open class Message(
    val id: Int,
    val text: String,
    val author: String
) {
}

class ChildMessage(
    val parentMessageId: Int,
    id: Int, text: String,
    author: String
) :
    Message(
        id,
        text,
        author
    ) {}

fun main() {
    val chat = Chat()

    chat.addMessage("Привет", "Аня")
    chat.addMessage("Как дела?", "Олег")
    chat.addThreadMessage(1, "Привет! Всё хорошо", "Иван")
    chat.addThreadMessage(2, "Отлично, а у тебя?", "Аня")

    println("\nЧат:")
    chat.printChat()
}