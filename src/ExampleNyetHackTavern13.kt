//Моделирование нескольких заказов

//Импортируем библиотеку для рандома
import kotlin.math.roundToInt
//иморт библитеки для чтения из файла
import java.io.File
//val patronList = mutableListOf("Eli","Mordoc","Sophi")
//Создаем переменную в которую считаем данные из файла
val menuLists=File("data/tavern-menu-data.txt")
    .readText()
    .split("\n")
fun main() {

//    Используем forEachIndexed
    patronListss.forEachIndexed { index, patron ->
        println("Добрый вечер, $patron - вы #${index+1} в очреди")
//        placeOrder(patron,"shandy,Dragon's Breath, 5.91")
        placeOrder(patron,menuLists.shuffled().first())
    }
//    выводим список
    println("Вывод списка посетителей: $patronListss")
//    Вывод меню
menuLists.forEachIndexed { index, data ->
    println("$index: $data")
}

}

private fun placeOrder(patronName:String,menuData:String){
    val indexOfAppostraphe = TAVEREN_NAME.indexOf('\'')
    val tavernMaster = TAVEREN_NAME.substring(0 until indexOfAppostraphe)
    val (type,name,price) = menuData.split(',')
    val message = "$patronName покупает у $tavernMaster: $name ($type) по цене $price"
    println("$patronName разговаривает с $tavernMaster о своём заказе")
    println(message)
    val phrase = if(name =="Dragon's Breath"){
        "$patronName восклицает ${toDragonSpeak("Ах, какой вкусный $name ")}"
    }else {
        "$patronName говорть: Спасибо за $name"
    }
    println(phrase)
    //Преобразование строки в Double
    performPurchas(price.toDouble())
}
private fun toDragonSpeak(phrase:String) =
    phrase.replace(Regex("""[а-я]|[А-Я]""")){
        when (it.value){
            "А" -> "0"
            "а" ->"4"
            "х" -> "3"
            "к" -> "1"
            "о" -> "|_|"
            else -> it.value
        }
    }
//Функция вывода баланса на экран
private fun displyBalance(){
    println("Баланс кошелька игрока:Gold: $playerGold, Silver:$playerSilver")
}
//Функция для вызова функции
fun performPurchas(price:Double){
    displyBalance()
    val totalPurse = playerGold+(playerSilver/100.0)
    val remainningBalance = totalPurse-price
//    Перевод серебра в золото
    val remainingGold = remainningBalance.toInt()
    val remainingSilver = (remainningBalance % 1 * 100).roundToInt()
    playerGold=remainingGold
    playerSilver=remainingSilver
    displyBalance()
    println("Всего в кошельке:$totalPurse")
    println("Покупка товара по цене: $price")
//    Выводим остаток на балансес помощью форматирования
    println("Остаток на балансе:${"%.2f".format(remainningBalance)}")
}

