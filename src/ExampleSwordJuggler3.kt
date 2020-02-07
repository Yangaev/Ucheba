import java.lang.IllegalStateException

//Объявляем свое исключение
fun main() {
var swordJuggling:Int? = null
    val isJugglingProficient = (1..3).shuffled().last()==3
    if(isJugglingProficient){
        swordJuggling=2
    }
    proficiencyChecks(swordJuggling)
    swordJuggling=swordJuggling!!.plus(1)
}
fun proficiencyChecks(swordJuggling:Int?){
//    swordJuggling ?: throw IllegalStateException ("Исключение - Игрок не может жанглировать")
    swordJuggling?: throw  UnskilledSwordJugglerExeption()
}
//Объявляем новый класс
class UnskilledSwordJugglerExeption():
        IllegalStateException("Исключение - Игрок не может жанглировать")