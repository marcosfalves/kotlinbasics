package br.com.mfalves.model

data class Personagem(var nome: String = "",
                 var idade: Int = 0,
                 var nave: String = "",
                 val amigos: MutableList<Personagem> = mutableListOf()
) {

    fun comIdade(novaIdade: Int) = this.apply { idade = novaIdade }
    fun comNave(novaNave: String) = this.apply { nave = novaNave }

    fun fazAniversario() : Personagem {
        idade++
        return this
    }

    fun adicionaAmigo(personagem: Personagem?) {
        personagem?.let {
            amigos.add(personagem)
        }
    }

    override fun toString() = "${this.nome} tem ${this.idade} anos e pilota ${this.nave}."

}

fun Personagem.imprime() {
    println(this)
}

fun Personagem.listaAmigos() {
    this.amigos.forEach {
        println(it.nome)
    }
}

fun Set<Personagem>.imprime() {
    print("[")
    this.forEach{
        print(" ${it.nome}, ")
    }
    print("]")
    println()
}