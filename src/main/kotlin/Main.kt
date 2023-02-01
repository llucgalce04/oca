//Atribueix el nombre de jugadors
var Jugador1 = Jugador()
var Jugador2 = Jugador()

fun main() {
    intro()
    val joc = OcaGame(listOf(Jugador1,Jugador2))
    joc.play()




}
