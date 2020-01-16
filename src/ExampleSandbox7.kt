/*
Тип функции как возвращаемый тип
Добавляем функцию configureGreetingFunction
 */
fun main() {
    runSimulation()

}
//Используем встривание

 fun runSimulation(){
    val greetingFunction = configureGreetingFunction()
     println(greetingFunction("Жора"))
     println(greetingFunction("Жора"))
}
//Функция configureGreetingFunction
fun configureGreetingFunction():(String)-> String{
    val structureType = "госпиталь"
    var numBuildings = 5
    return {
        playerName : String ->
        val currentYaer = 2018
        numBuildings += 1
        println("Добавленно $numBuildings $structureType")
        "Добро пожаловать в СимВилаж, $playerName!(c $currentYaer)"
    }
}