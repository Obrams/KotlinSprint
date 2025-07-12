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
    var listParticipants: MutableList<Participant> = mutableListOf(),
) {
    fun participantToAdd(participant: Participant) {
        listParticipants.add(participant)
        println("Участник ${participant.nickname} успешно добавлен в комнату '${name}'")
    }

    fun updateStatus(nickname: String, newStatus: UserStatus) {
        for (i in listParticipants) {
            if (i.nickname == nickname) {
                i.status = newStatus
                println("Статус участника ${i.nickname} изменен на $newStatus")
                return
            }
        }
        println("Участник с именем $nickname не найден в комнате.")
    }
}

fun main() {
    val partyRoom = Room(cover = "cover.jpg", name = "Болтаем")

    val alice = Participant(avatar = "alice.png", nickname = "Alice", UserStatus.MICROPHONE_OFF)

    partyRoom.participantToAdd(alice)

    partyRoom.updateStatus("Alice", UserStatus.MUTED)

}