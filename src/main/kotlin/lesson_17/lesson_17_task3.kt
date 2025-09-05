package lesson_17


class Folder(
    private val _name: String,
    private val _countFiles: Int,
    var isSecret: Boolean = false
) {
    val name: String
        get() = if (isSecret) "скрытая папка" else _name
    val countFiles: Int
        get() = if (isSecret) 0 else _countFiles
}


fun main() {
    val folderSecret = Folder("Секретная папка", 20, true)
    println("Название папки: ${folderSecret.name}")
    println("Количество файлов в папке: ${folderSecret.countFiles}")

    val folder = Folder("Не секретная папка", 3)
    println("Название папки: ${folder.name}")
    println("Количество файлов в папке: ${folder.countFiles}")

}