//Возбуждение IllegalStateException
import java.lang.IllegalStateException

fun main() {
        var swordJuggler:Int? = null
        val  isJugglingProficient = (1..3).shuffled().last()==3
        if(isJugglingProficient){
            swordJuggler =2
        }
    proficiencyCheck(swordJuggler)
    swordJuggler = swordJuggler!!.plus(1)
}
fun proficiencyCheck (swordJuggler:Int?){
    swordJuggler ?: throw IllegalStateException ("Игрок не может жанглировать мечами")
}