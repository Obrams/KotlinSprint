package lesson_11

class Forum {
    private var nextUserId = 1
    private val members = mutableListOf<ForumMember>()

    fun createNewUser(userName: String): ForumMember {
        val newId = nextUserId
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
