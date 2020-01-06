//Пример 2.2 Объявление переменной в Kotlin
// Объявляем константу времени исполнения
const val MAX_EXPERIENS = 5000
// Задание 2 Добавляем название таверны
const val NAME_TAVERN = "Рог единарога"

fun main() {
//    Добавляем val для хранения имени игрока
    val playerName = "Estragon"
    val nameTraktir = "Stiv"
//    Задание 1 объявить переменную hasSteed чтобы отслеживать наличие скакуна
    var hasSteed = false
// Задание 2 Добавляем переменную колличества монет
    var numberOfCoins =50
// Задание 2 Создаем список меню
    val menuList = listOf("Мёд","Вино", "Пиво")

    var experiencePints = 5

    println("Колличество очков: $experiencePints")
    println("Имя игрока: $playerName")
    println("Выводим имя игрока в наоборот: ${playerName.reversed()}")
    println("$menuList")
}