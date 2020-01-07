/*Домашнее задание. Дурманищий эфект fireball
Нужно передалать функцию castFireball возвращать значение результата одурманивания, зависящего от колличества
накалдованных бокалов. Уровень одурманивания должен изменяться в пределах значений от 1 .. 50. 50 - максимальное значение.

 */
// Рефакторинг с применением when
fun main() {
//    Имя игрока
    val name = "Madrigal"
//    Здоровье
    val healtPoints = 89
//    Переменная благословления
    val isBlessed = true
//    Переменная ауры
    val isImmortal = false

//    Вывод ауры
    val auraColor = auraColor(isBlessed, healtPoints, isImmortal)
    println("Аура - $auraColor")

    val healtStatus = any(healtPoints, name, isBlessed)
    println("$healtStatus")
//    Вызов собственной функции, создающая напиток
    println(castFureball(10))
}

private fun auraColor(isBlessed: Boolean, healtPoints: Int, isImmortal: Boolean): String {
    val auraVisible = isBlessed && healtPoints >= 89 || isImmortal
    val auraColor = if (auraVisible) "Green" else "None"
    return auraColor
}

private fun any(healtPoints: Int, name: String, isBlessed: Boolean): Any {
    val healtStatus = when (healtPoints) {
        100 -> "$name - в прекрасном состоянии"
        in 90..99 -> (healtPoints in 90..99)
        in 75..89 -> if (isBlessed) {
            "$name - имеет незначительные ранения"
        } else {
            "Все это ерунда"
        }
        in 15..74 -> "$name - нужно к врачу"
        else -> "$name - в ужасном состоянии"
    }
    return healtStatus
}
//Добавляем собственную функцию порождающую бокал дурманящего напитка
private fun castFureball (numFireballs:Int):String{
    return when (numFireballs){
        in 1..10 -> " навеселе"
        in 11..20 -> " выпивший"
        in 21..30 -> " пьяный"
        in 31..40 -> "сильно пьяный"
        in 41..50 -> "в стельку"
        else -> "Ты ничего не наколдовал"
    }
}


