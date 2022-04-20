package br.com.mfalves.collections

import br.com.mfalves.model.Personagem

fun main(args:Array<String>){

    val luke = Personagem("Luke Skywalker", 19, "X-wing") // 0
    val han = Personagem("Han Solo", 30, "Millenium Falcon") // 1
    val vader = Personagem("Darth Vader", 40, "TIE Interceptor")// 2
    val obiWan = Personagem("Obi-wan Kenobi", 60, "Jedi Starfighter") // 3

    val leia = Personagem("Leia Organa", 19, "nenhuma nave")

    val lista : List<Personagem> = listOf(luke, han, vader, obiWan)
    val listaCopy : List<Personagem> = listOf(han, luke, vader, obiWan)

    println(lista == listaCopy) //Precisa estar na mesma ordem para ser consideradas iguais

    println("Tamanho: ${lista.size}")
    println("Empty: ${lista.isEmpty()}")
    println("Posição 1: ${lista[1]}")

    for (i in lista.indices){
        println(lista[i])
    }

    for (p in lista){
        println(p)
    }

    lista.forEach { it -> println(it)}

    //Imutavel, não permite substituir
    //lista[1] = leia

    lista[2].apply {
        this.nome = "Anakin Skywalker"
    }
    println(lista[2])

    println("*******************************************************************")
    //Implementado interface MutableList (Permitir manipular a lista)
    val lista2 : MutableList<Personagem> = mutableListOf(luke, han, vader, obiWan)
    lista2.add(leia)
    lista2.remove(luke)
    lista2.forEach { it -> println(it)}
    println("*******************************************************************")
    println(lista2.first())
    println(lista2.last())
    lista2.shuffle() //embaralha  a lista

    println("*******************************************************************")
    val admiral = Personagem("Admiral Ackbar", 180, "Nebulon-B Frigate")
    lista2.add(admiral)
    lista2.forEach { it -> println(it)}
    println("*********************** Sort ***********************************")
    lista2.sortBy {
        it.nome
    }
    lista2.forEach { it -> println(it)}

}