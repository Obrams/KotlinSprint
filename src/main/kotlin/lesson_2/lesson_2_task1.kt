package lesson_2

fun main() {
    val student1 = 3
    val student2 = 4
    val student3 = 3
    val student4 = 5
    var numberStudent = 4
    val arithmeticMean =
        (student1.toDouble() + student2.toDouble() + student3.toDouble() + student4.toDouble()) / numberStudent
    println("Среднее арифмитическое: $arithmeticMean")
}
