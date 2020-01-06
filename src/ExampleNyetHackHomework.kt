@file:Suppress("IMPLICIT_CAST_TO_ANY")

import kotlin.math.pow

//Домашняя работа 3. Вывод расширенной информации об ауре
fun main() {
    val name = "Madrigal"
    val healtPoints = 89
//    Переменная благословления
    val isBlessed = true
//    Переменная ауры
    val isImmortal = false
//Переменная цвет ауры
    var auraColor = ""


//Пременная для вкл/выкл ауры

    val auraVisible = isBlessed && healtPoints >= 89 || isImmortal

//    Вывод ауры
println(carma(auraVisible,healtPoints))
//    оператор when
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
    println("$healtStatus")
}
//   Функция карма
fun carma(auraVisible:Boolean, healtPoints:Int):String {
      var karma = ""
         if (auraVisible) {
           karma = when ((Math.random().pow((110 - healtPoints) / 100.0) * 20).toInt()) {
                in 0..5 -> "red"
                in 6..10 -> "orange"
                in 11..15 -> "purpule"
                in 16..20 -> "green"
                else -> ""
            }
        }
         return karma
}

