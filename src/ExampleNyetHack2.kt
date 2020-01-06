//Вывод состояния игрока Пример 3.1
fun main() {
    val name = "Madrigal"
    val healtPoints = 89
//    Переменная благословления
    val isBlessed = true
//    Переменная ауры
    val isImmortal = false

//    Вывод ауры
//Пременная для вкл/выкл ауры

    val auraVisible = isBlessed && healtPoints >= 89 || isImmortal
    val auraColor = if (auraVisible) "Green" else "None"
    println(auraColor)

//    Условие if
    val healtStatus = if (healtPoints==100){
        "$name - в прекрасном состоянии"
    }else if (healtPoints>=90){
        "$name - имеет несколько царапин"
    } else if (healtPoints>=75){
        if (isBlessed){
            "$name - имеет незначительные ранения"
        }else{
            "Все это ерунда"
        }
    }else if (healtPoints>=15){
        "$name - нужно к врачу"
    }else{
        "$name - в ужасном состоянии"
    }
    println("$name - $healtStatus")
}