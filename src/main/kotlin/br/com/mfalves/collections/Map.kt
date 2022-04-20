package br.com.mfalves.collections

import br.com.mfalves.model.Starship

fun main(args:Array<String>){

    val xWing = Starship("X-Wing", "Space superiority fighter", "Incom Corporation", 2)
    val yWing = Starship("Y-Wing", "Assault starfighter/bomber", "Koensayr Manufacturing", 3)
    val tieFighter = Starship("TIE fighter","Space superiority fighter", "Sienar Fleet Systems", 1)
    val corvette = Starship("Corellian Corvette", "Corvette", "Corellian Engineering Corporation", 300)
    val aWing = Starship("A-Wing", "Interception starfighter", "Kuat Systems Engineering", 1)

    val pair: Pair<String, Starship> = Pair("T-65B", xWing)

    val naves: MutableMap<String, Starship> = mutableMapOf(pair,
                                        Pair("T-70", xWing),
                                        "T-80" to xWing)

    naves.put("BTL-B", yWing)
    naves["RZ-1"] = aWing //Adiciona
    naves["T-65B"] = aWing //Substitui
    naves.remove("T-65B") //Remove

    println("Está vazio: ${naves.isEmpty()}")
    println("Tamanho: ${naves.size}")
    println("Chaves: ${naves.keys}")
    println("Valores: ${naves.values}")
    println("Entries: ${naves.entries}")
    println("Naves: $naves")

    println("****************************** CONJUNTOS ******************************")

    val navesRebeliao: MutableMap<String, Starship> = mutableMapOf("T-65B" to xWing,
    "T-70" to xWing,
    "T-80" to xWing,
    "BTL-B" to yWing,
    "RZ-1" to aWing)

    val outrasNaves: MutableMap<String, Starship> = mutableMapOf("TIE/ln" to tieFighter, "CR90" to corvette)

    val todasNaves: MutableMap<String, Starship> = mutableMapOf()

    println("Tamanho: ${todasNaves.size}")
    todasNaves.putAll(navesRebeliao)
    println("Tamanho: ${todasNaves.size}")
    todasNaves += outrasNaves
    println("Tamanho: ${todasNaves.size}")

    println("Chaves: ${todasNaves.keys}")
    println("Valores: ${todasNaves.values}")

    todasNaves.keys.forEach { println(it) }
    todasNaves.values.forEach { it.imprime() }

    todasNaves.forEach {
        println(it.key)
        it.value.imprime()
    }

    println("****************************** FILTROS ******************************")
    println("Naves com T-")
    val todosFilter = todasNaves.filterKeys { key -> key.contains("T-") }
    todosFilter.forEach {
        println(it.key)
        it.value.imprime()
    }

    println("Naves de Batalha")
    val navesBatalha = todasNaves.filterValues { value -> value.classe.contains("fighter") }
    navesBatalha.forEach {
        it.value.imprime()
    }

    println("Filtro com chave e valor")
    val navesFilter = todasNaves.filter { (key, value) ->
        key.contains("T") && value.tripulacao <= 2
    }
    navesFilter.forEach { it.value.imprime() }
}