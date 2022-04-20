package br.com.mfalves.model

data class Starship(
    val nome: String,
    val classe: String,
    val fabricante: String,
    val tripulacao: Int
) {
    fun imprime() {
        print(
            """
            Nome: $nome
            Classe: $classe
            Fabricante: $fabricante
            Tripulacao: $tripulacao
            ----
            """
        )
    }

    override fun toString() = "$nome - $classe"
}
