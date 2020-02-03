//Использование оператора ?: (Элвис)
fun main() {
    var bevarrage = readLine()
    if(bevarrage!=null){
        bevarrage.capitalize()
    }else{
        println("Я не могу сделать этот напиток без сбоев - напиток был нулевым")
    }
    val bevarrgeServerd = bevarrage?:"Эль"
    println(bevarrgeServerd)
}