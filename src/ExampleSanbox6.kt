/*
Функция, которая принимает функцию
Добавляем к предыдушему примеру еще одну функцию runSimulation
Ссылка на функцию
Объявление функции printConstructionCost
 */
fun main() {
//    Используем сокращенный синтаксис
      runSimulations("Жора",::printConstructionCost){playerName, numBuildings ->
        val currentYear = 2018
        println("Добавили $numBuildings дома")
        "Добро пожаловать в СимВиллаж, $playerName!($currentYear)"
    }
}
//Используем встривание
 inline fun runSimulations(playerName:String, costPrinter :(Int)->Unit,
                           greetingFunction: (String,Int) ->String){
    val numBuildings = (1..3).shuffled().last() //Здесь случайным образом выбираем число от 1 до 3
    costPrinter(numBuildings)
    println(greetingFunction(playerName,numBuildings))
}
fun printConstructionCost (numBuildings:Int){
    val cost = 500
    println("стоимость строительства: ${cost * numBuildings}")
}