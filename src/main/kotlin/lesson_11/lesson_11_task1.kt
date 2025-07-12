package lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {

}

fun main() {

    val user1 = User(
        id = 1,
        login = "Vladik",
        password = "Vladik228",
        email = "vlad@mail.ru",
    )

    val user2 = User(
        id = 2,
        login = "BigBoss",
        password = "BigBoss228",
        email = "big@mail.ru",
    )

    println("User 1: id= ${user1.id}, login= ${user1.login}, email= ${user1.email}")
    println()
    println(user2.login)
    println(user2.password)
}
