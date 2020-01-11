/*
Функция, которая принимает функцию
Добавляем к предыдушему примеру еще одну функцию runSimulation
 */
fun main() {
//    val greetingFuction = {playerName:String, numBuildings:Int ->
//    Используем сокращенный синтаксис
      runSimulation("Жора"){playerName, numBuildings ->
        val currentYear = 2018
        println("Добавили $numBuildings дома")
        "Добро пожаловать в СимВиллаж, $playerName!($currentYear)"
    }
//    runSimulation("Жора",greetingFuction)
}
//Используем встривание

 inline fun runSimulation(playerName:String, greetingFunction: (String,Int) ->String){
    val numBuildings = (1..3).shuffled().last() //Здесь случайным образом выбираем число от 1 до 3
    println(greetingFunction(playerName,numBuildings))
}