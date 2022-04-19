import java.util.*
//Imprimir as representações binárias dos caracteres de A a F

fun main () {
    val binaryRepresentation = TreeMap<Char,String>()

    for (c in 'A'..'F'){
        binaryRepresentation[c] = Integer.toBinaryString(c.toInt())
    }

    for ((letter, binary) in binaryRepresentation) {
        println("$letter - $binary")
    }
}