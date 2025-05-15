package lesson_2

fun main() {
    val workersCount = 50
    val salaryOneWorker = 30000
    val internCount = 30
    val salaryOneIntern = 20000
    val salaryManyWorkers = workersCount * salaryOneWorker
    val totalExpenses = (internCount * salaryOneIntern) + salaryManyWorkers

    println("Расходы на зарплаты постоянных сотрудников: $salaryManyWorkers")
    println("Общие расходы после прихода стажеров: $totalExpenses")
    println("Средняя ЗП одного сотрудника после устройства стажеров: ${totalExpenses / (workersCount + internCount)}")
}
