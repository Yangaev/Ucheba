// Рефакторинг с применением when
fun main() {
    val name = "Madrigal"
    val healtPoints = 89
//    Переменная благословления
    val isBlessed = true
//    Переменная ауры
    val isImmortal = false

//    Вывод ауры
//Пременная для вкл/выкл ауры

    val auraColor = auraColor(isBlessed, healtPoints, isImmortal)
    //    println(auraColor)
    println("Аура - $auraColor")
//    оператор when
    val healtStatus = any(healtPoints, name, isBlessed)
    println("$healtStatus")
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