class OcaGame(val jugadors: List<Jugador>) {


    val caselles = Taulell().casillas


    //La funcio tirarDau fa un readln perque el joc sigui de manera menys dinamica
    // que per cada torn hagis de donarli a l'intro ja que sino el joc jugaria sol, despres també fa el random del 1 al 6 que simula un dau
    fun tirarDau(): Int {
        /*enter per jugar*/
        readln()
        return (1..6).random()
    }

    //La funcio moure ens demana
    fun moure(player: Jugador, moviment: Int, ronda: Int, rondaPartida: Int) {
        player.posicio += moviment
        if (player.nortirar==false) {
            println("${player.nom} et mous fins la posicio ${player.posicio}")
        }

        if (player.posicio >= 63) {
            player.posicio = 63
            println("Has guanyat!!!")
            return
        }


        val casella = caselles[player.posicio]

        //Ocas
        if (casella.mouPosicions == 4) {
            player.posicio += casella.mouPosicions
            println("De oca a oca i tiro porque me toca")
            val dau = tirarDau()
            println("${player.nom} ha tret un: $dau")
            //moure(player, dau)

        }

        //Dau bo
        else if (casella.mouPosicions == 25) {
            player.posicio += casella.mouPosicions
            println("${player.nom} et mous fins la posicio ${player.posicio}")
            println("De dado a dado y tiras porque te ha dado")
            val dau = tirarDau()
            // moure(player, dau)
            println("${player.nom} ha tret un: $dau")
        }
        //Dau dolent
        else if (casella.mouPosicions == -25) {
            player.posicio += casella.mouPosicions
            println("De dado a dado y no tiras porque te ha dado")
            println("${player.nom} et mous fins la posicio ${player.posicio}")

        }
        //Calavera
        else if (casella.mouPosicions == -57) {
            player.posicio += casella.mouPosicions
            println("Has muerto ahora tienes que volver a empezar")
            println("${player.nom} et mous fins la posicio ${player.posicio}")
        }


        //Carcel
        else if (casella.perdsPartides == 3) {
            println("Has sido arrestado ahora te tienes que quedar 3 turnos aqui")
            player.nortirar = true
            if (ronda == rondaPartida - 2) {
                player.nortirar = false
            }


        }
        //Posada
        else if (casella.perdsPartides == 2) {
            println("Te has emborachado te quedas en la posada por 2 turnos")
            player.nortirar = true
            if (ronda == rondaPartida - 1) {
                player.nortirar = false
            }



        }


    }

    fun play() {
        var isWinner = false
        var rondaPartida = 1




        while (!isWinner) {
            for (i in 0..jugadors.size - 1) {
                jugadors[i].turno = true
                if (!jugadors[i].nortirar) {
                    val roll = tirarDau()
                    println("${jugadors[i].nom} ha tret un: $roll")
                    moure(jugadors[i], roll, jugadors[i].ronda, rondaPartida)
                    jugadors[i].ronda = rondaPartida

                } else {
                    println("${jugadors[i].nom} se li salta el torn")
                    moure(jugadors[i], 0, jugadors[i].ronda, rondaPartida)

                }

                if (jugadors[i].posicio == 63) {
                    isWinner = true
                }
                jugadors[i].turno = false
            }
            rondaPartida++
        }

        // El joc ha acbat
    }
}


