//Использование ! = для проверки на null
fun main() {
    var bevarrage = readLine()
    if (bevarrage != null){
        bevarrage = bevarrage.capitalize()
    }else{
        println("Я не могу сделать это без сбоев - напиток был нулевым")
    }
    println(bevarrage)
}