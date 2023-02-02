class Taulell  {

    private val casFinal = 63
    val casillas: ArrayList<Casella> = arrayListOf()



    init {
        // creem las casellas
        for (i in 0 until casFinal) {
            casillas.add(Casella("Casella$i"))
        }
        casillas[0] = Casella("Sortida", 0, 0)
        casillas[4] = Casella("Oca1", 4, 0)
        casillas[8] = Casella("Oca2", 4, 0)
        casillas[13] = Casella("Oca3", 4, 0)
        casillas[17] = Casella("Oca4", 4, 0)
        casillas[22] = Casella("Oca5", 4, 0)
        casillas[26] = Casella("Oca6", 4, 0)
        casillas[31] = Casella("Oca7", 4, 0)
        casillas[35] = Casella("Oca8", 4, 0)
        casillas[40] = Casella("Oca9", 4, 0)
        casillas[44] = Casella("Oca10", 4, 0)
        casillas[53] = Casella("Oca11", 4, 0)
        casillas[58] = Casella("Oca12", 4, 0)
        casillas[5] = Casella("Puente_Primero", 6, 0)
        casillas[11] = Casella("Puente_Segundo", -6)
        casillas[18] = Casella("Posada", 0, 10)
        casillas[55] = Casella("Carcel",  0, 3)
        casillas[25] = Casella("Daus", 25, 0)
        casillas[52] = Casella("Daus2", -25, 0)
        casillas[57] = Casella("Calavera", -57, 0)
        casillas[62] = Casella("Final", 0, 0)




    }


}