fun main(){
   comprobarFuncio()
}
val posis: ArrayList<Int> = arrayListOf()

fun comprobarFuncio(){
    for (i in Taulell().casillas){
        posis.add(Casella().mouPosicions)
    }
    for (i in posis){
        if (i > 0){
            println("De oca a oca i tiro porque me toca")
        }
    }}

