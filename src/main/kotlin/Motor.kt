class OcaGame(val jugadors: List<Jugador>) {


    val caselles = Taulell().casillas


    fun tirarDau(): Int {
        /*enter per jugar*/
        readln()
        return (1..6).random()
    }


    fun moure(player: Jugador, moviment: Int) {
        player.posicio += moviment
        if (player.posicio >= 63) {
            player.posicio = 63
            println("Has guanyat!!!")
            return
        }

        val casella = caselles[player.posicio]
        val posis: ArrayList<Int> = arrayListOf()

        fun comprobaPosicio(){
            for (i in Taulell().casillas){
               posis.add(Casella().mouPosicions)
            }

        }
        fun esOca(){
            for (i in posis){
                if (i > 0){
                    println("De oca a oca i tiro porque me toca")
                }
            }
        }
        esOca()
        comprobaPosicio()

        if (casella.mouPosicions != 0) {
            player.posicio += casella.mouPosicions
            val dau = tirarDau()
            moure(player, dau)


        } else if (casella.tornaTirar == true) {
            val dau_tornar_tirar = tirarDau()
            moure(player, dau_tornar_tirar)

        } else if (casella.perdsPartides != 0) {
            player.posicio -= casella.perdsPartides
        }


        println("${player.nom} et mous fins la posicio ${player.posicio}")
        println(player.posicio)


    }

    fun play() {
        var isWinner = false


        while (!isWinner) {
            for (jugador in jugadors) {
                val roll = tirarDau()
                println("${jugador.nom} ha tret un: $roll")
                moure(jugador, roll)
                if (jugador.posicio == 63) {
                    isWinner = true
                }
            }
        }

        // El joc ha acbat
    }
}

