//Вывод состояния игрока Пример 3.1
fun main() {
    val name = "Madrigal"
    var healtPoints = 89
//    Переменная благословления
    val isBlessed = true
//    Переменная ауры
    val isImmortal=false

//    Вывод ауры
//Пременная для вкл/выкл ауры
    //    if (isBlessed && healtPoints>=89 ||isImmortal){
    val auraVisible = isBlessed && healtPoints>=89 ||isImmortal
    if (auraVisible){
        println("Аура есть - GREEN")
    }else{
        println("Ауры нет - NONE")
    }

//    Условие if
    if(healtPoints==100){
        println("$name - в прекрасном состоянии")
    }else if (healtPoints >=90){
        println("$name - Немного ранен")
    }else if (healtPoints >=89){
        if (isBlessed){
            println("$name - Раны теперь заживают быстрее, так как ты благославлен")
        }else{
            println("$name - Бонус благославления закончился")
        }
    }else if (healtPoints >=15){
        println("$name - Пора обратится в скорую")
    }
    {
        println("$name - в ужасном состоянии")
    }
}