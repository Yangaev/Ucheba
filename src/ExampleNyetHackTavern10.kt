//Настройка кошелька игрока
const val TAVEREN_NAME = "Billbo's Begins"
//Переменные для хранения золотых монет
val playerGold = 10
val playerSilver = 10
fun main() {
    placeOrder("shandy,Dragon's Breath, 5.91")
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
    performPurchase(price.toDouble())
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
fun performPurchase(price:Double){
    displyBalance()
    println("Покупка товара по цене: $price")
}
