// Добавление логики жонглирования мечами
fun main() {
    var swordsJuggling:Int? = null
    val  isJugglingProficient = (1..3).shuffled().last()==3
    if (isJugglingProficient){
        swordsJuggling = 2
    }
    println("Ты жанглируешь $swordsJuggling мечами")
}