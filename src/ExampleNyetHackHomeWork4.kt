//Домашняя работа. Сколько осталось пинт
import kotlin.math.roundToInt
import pints as pints

//const val TAVERN_NAMESS = "Billbo's Begins"
//Переменные для хранения золотых монет
var barrels = 5.0
const val pintes = 0.125
var drCoin = 5.0
val kurs = 1.43
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
    //Преобразование строки в Double
    performsPurchases(price.toDouble())
    drinkPinta()
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
    println("Баланс кошелька игрока: DrCoin:$drCoin")
}
//Функция для вызова функции
fun performsPurchases(price:Double){
    displyBalance()
//Переводим DrCoin в золото
    val totalPurse = drCoin*kurs
    if(totalPurse<price){
        println("Нехватает ${"%.2f".format(totalPurse-price)} для покупки ")
    }else{
//       Совершаем покупки
        val remainningBalance = totalPurse-price
//    Перевод золота в DrCoin
        val remainingGold = remainningBalance/kurs
        displyBalance()
        println("Всего в кошельке:${"%.2f".format(totalPurse)} Gold")
        println("Покупка товара по цене: $price")
//    Выводим остаток на балансес помощью форматирования
        println("Остаток на балансе:${"%.4f".format(remainingGold)}")
    }

}
private fun drinkPinta(){
    for (i in 1..12){
        barrel -= pints
        println("Заказ № $i = Остаток в бочке $barrel ")
    }

}