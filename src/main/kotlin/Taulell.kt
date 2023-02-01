class Taulell  {

    val CAS_FINAL = 63
    val casillas: ArrayList<Casella> = arrayListOf()



    init {
        // creem las casellas
        for (i in 0 until CAS_FINAL) {
            casillas.add(Casella("Casella$i"))
        }
        casillas[0] = Casella("Sortida", 0, 0, false)
        casillas[4] = Casella("Oca1", 4, 0, false)
        casillas[8] = Casella("Oca2", 4, 0, false)
        casillas[13] = Casella("Oca3", 4, 0, false)
        casillas[17] = Casella("Oca4", 4, 0, false)
        casillas[22] = Casella("Oca5", 4, 0, false)
        casillas[26] = Casella("Oca6", 4, 0, false)
        casillas[31] = Casella("Oca7", 4, 0, false)
        casillas[35] = Casella("Oca8", 4, 0, false)
        casillas[40] = Casella("Oca9", 4, 0, false)
        casillas[44] = Casella("Oca10", 4, 0, false)
        casillas[53] = Casella("Oca11", 4, 0, false)
        casillas[58] = Casella("Oca12", 4, 0, false)
        casillas[5] = Casella("Puente_Primero", 6, 0, true)
        casillas[11] = Casella("Puente_Segundo", -6, 1, false)
        casillas[18] = Casella("Posada", 0, 1, false)
        casillas[41] = Casella("Laberinto", 0, 3, false)
        casillas[55] = Casella("Carcel",  0, 2, false)
        casillas[25] = Casella("Daus", 25, 0, false)
        casillas[52] = Casella("Daus2", -25, 0, false)
        casillas[57] = Casella("Calavera", 25, -57, false)
        casillas[62] = Casella("Final", 0, 0, false)




    }


}