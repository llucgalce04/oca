fun main() {
    intro()
    //Atribueix el nombre de jugadors
    val jugador1 = Jugador(retornarNombreval(), retornarColorJugador(),0,false,true, 1)
    val jugador2 = Jugador(retornarNombreval(), retornarColorJugador(),55,true,false, 1)


    val joc = OcaGame(listOf(jugador1,jugador2))
    joc.play()




}
