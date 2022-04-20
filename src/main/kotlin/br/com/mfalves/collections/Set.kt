package br.com.mfalves.collections

import br.com.mfalves.model.Personagem
import br.com.mfalves.model.imprime

fun main(args:Array<String>){

    //Rebeldes
    val luke = Personagem("Luke Skywalker", 19, "X-wing")
    val han = Personagem("Han Solo", 30, "Millenium Falcon")
    val leia = Personagem("Leia Organa", 19, "nenhuma nave")
    val chewie = Personagem("Chewbacca", 190, "Millenium Falcon")

    //Imperiais
    val vader = Personagem("Darth Vader", 40, "TIE Interceptor")
    val emperor = Personagem("Emperor Palpatine", 65, "Lambda-class shuttle" )
    val moffTarkin = Personagem("Grand Moff Tarkin", 64, "Imperial Star Destroyer")

    //Outros
    val obiWan = Personagem("Obi-wan Kenobi", 60, "Jedi Starfighter")
    val yoda = Personagem("Yoda", 900, "nenhuma nave")
    val bobaFett = Personagem("Boba Fett", 35, "Firespray")
    val lando = Personagem("Lando Calrissian", 46, "Lady Luck")

    //Set - Coleção de elementos únicos
    //União, subtração, interseção

    val rebeldes: Set<Personagem> = setOf(luke, han, leia, chewie)

    println("Tamanho: ${rebeldes.size}")
    println("Empty: ${rebeldes.isEmpty()}")

    rebeldes.forEach { println(it) }

    println("*******************************************************************")
    var rebeldes2: MutableSet<Personagem> = mutableSetOf(luke, han, leia, chewie)
    rebeldes2.forEach { println(it) }
    println("*******************************************************************")
    rebeldes2.add(luke)
    rebeldes2.add(Personagem("Chewbacca", 190, "Millenium Falcon")) //equals
    rebeldes2.forEach { println(it) }
    rebeldes2.forEach {
        println("@${it.hashCode()} -> ${it.nome}")
    }


    println("************************** CONJUNTOS *******************************")
    val ep4 = setOf(luke, leia, han, chewie, vader, emperor, moffTarkin, obiWan)
    val ep5 = setOf(luke, leia, han, chewie, vader, emperor, yoda, bobaFett, lando)

    ep4.imprime()
    ep5.imprime()

    val todosPersonagens = ep4.union(ep5)
    todosPersonagens.imprime()

    val comuns = ep4.intersect(ep5)
    comuns.imprime()

    val novos = ep5.minus(ep4)
    novos.imprime()


    //Não precisa estar na mesma ordem para ser considerado igual (Diferente do List)
    val ep4Copy = setOf(leia, luke, han, chewie, vader, emperor, moffTarkin, obiWan)
    println(ep4 == ep4Copy)



    val ep4Hash = hashSetOf(leia, luke, han, chewie, vader, emperor, moffTarkin, obiWan)
    ep4Hash.imprime()
    ep4Hash.add(Personagem("Biggs Darklighter", 19, "X-Wing"))
    ep4Hash.imprime()

}