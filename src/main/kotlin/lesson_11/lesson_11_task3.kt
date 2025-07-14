package lesson_11

enum class UserStatus {
    SPEAKING,
    MICROPHONE_OFF,
    MUTED,
}

class Participant(
    val avatar: String,
    val nickname: String,
    var status: UserStatus,
)

class Room(
    val cover: String,
    val name: String,
    var participants: MutableList<Participant> = mutableListOf(),
) {
    fun addParticipant(participant: Participant) {
        participants.add(participant)
        println("Участник ${participant.nickname} успешно добавлен в комнату '${name}'")
    }

    fun updateStatus(nickname: String, newStatus: UserStatus) {
        val participant = participants.find { it.nickname == nickname }

        if (participant != null) {
            participant.status = newStatus
            println("Статус участника ${participant.nickname} изменен на $newStatus")
        } else {
            println("Участник с именем $nickname не найден в комнате.")
        }
    }
}

fun main() {
    val partyRoom = Room(cover = "cover.jpg", name = "Болтаем")

    val alice = Participant(avatar = "alice.png", nickname = "Alice", UserStatus.MICROPHONE_OFF)

    partyRoom.addParticipant(alice)

    partyRoom.updateStatus("Alice", UserStatus.MUTED)

}