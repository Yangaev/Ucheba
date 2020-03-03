//Создание списка посетителей
import kotlin.math.roundToInt

//Переменные для хранения золотых монет
//var playerGold = 10
//var playerSilver = 10
//Создание списка посетителей
val patronLists = listOf("Eli","Mordoc","Sophi")
fun main() {
    placeOrder("shandy,Dragon's Breath, 5.91")
//    Проверяем посетиля
    if(patronLists.contains("Eli")){
        println("Хозяин таверны говорит: Эли находится в конце комнаты")
    }else{
        println("Хозяин таверны говорит: Эли здесь нет")
    }
//    проверка присутствие нескольких посетителй
    if(patronLists.containsAll(listOf("Sophi","Mordoc"))){
        println("Хозяин таверны говорит: Да они сидят у чайника")
    }else{
       println("Хозяин таверны говорит: Нет, они ушли пару часов назад")
    }
//    println("Вывод списка посетителей: $patronLists")
//    println("Выводим первого посетителя: ${patronLists[0]}")
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
    performPurchases(price.toDouble())
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
fun performPurchases(price:Double){
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

