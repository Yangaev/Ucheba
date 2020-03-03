// Создание изменяемого списка посетителей
//Создание списка посетителей
import kotlin.math.roundToInt

//Переменные для хранения золотых монет
//var playerGold = 10
//var playerSilver = 10
//Создание списка посетителей
val patronListss = mutableListOf("Eli","Mordoc","Sophi")
fun main() {
    placeOrder("shandy,Dragon's Breath, 5.91")
//    выводим список
    println("Вывод списка посетителей: $patronListss")
    patronListss.remove("Eli")
    patronListss.add("Alex")
    println("Вовод измененного списка посетителей $patronListss")

}

private fun placeOrder(menuData:String){
    val indexOfAppostraphe = TAVEREN_NAME.indexOf('\'')
    val tavernMaster = TAVEREN_NAME.substring(0 until indexOfAppostraphe)
    val (type,name,price) = menuData.split(',')
    val message = "Мадригал покупает у $tavernMaster: $name ($type) по цене $price"
    println("Мадригал разговаривает с $tavernMaster о своём заказе")
    println(message)
    val phrase = if(name =="Dragon's Breath"){
        "Мадригал восклицает ${toDragonSpeak("Ах, какой вкусный $name ")}"
    }else {
        "Мадригал говорть: Спасибо за $name"
    }
    println(phrase)
    //Преобразование строки в Double
    performPurchasess(price.toDouble())
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
fun performPurchasess(price:Double){
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

