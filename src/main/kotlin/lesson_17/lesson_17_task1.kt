package lesson_17

class Question(
    questionInput: String,
    answerInput: String
) {
    val question = questionInput
        get() = field
    var answer = answerInput
        get() = field
        set(value) {
            field = value
        }

}

fun main() {
    val quiz = Question("Какая столица России?", "Москва")

    println(quiz.question)

    println(quiz.answer)

    quiz.answer = "Москва - столица РФ"
}