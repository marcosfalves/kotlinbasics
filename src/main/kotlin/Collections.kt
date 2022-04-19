fun main() {
    //COMO CRIAR COLEÇÕES

    //ArrayList - Classe
    val frutas1 = ArrayList<String>()
    frutas1.add("Maçã")
    frutas1.add("Banana")
    frutas1.add("Morango")
    println(frutas1)

    ///ArrayList - Função
    val frutas2 = arrayListOf<String>("Maçã", "Banana", "Morango")
    println(frutas2)


    /* ####################################################### */
    /*              BIBLIOTECA PADRÃO DO JAVA                  */
    /* ####################################################### */

    //Confirmar que as bibliotecas são de fato do Java padrão
    println(HashSet::class.java)

    //Podemos tirar muito mais proveito das coleções em Kotlin (Extenções de funções)
    println(frutas2.last())

    val numeros = setOf(1 ,14 ,2)
    //println(numeros.max)

}