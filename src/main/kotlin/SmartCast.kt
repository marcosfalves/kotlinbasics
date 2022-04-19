import java.lang.IllegalArgumentException

// (1 + 2) + 4
interface Expressao
class Numero(val valor: Int): Expressao
class Soma(val esquerdo: Expressao, val direito: Expressao): Expressao

fun avaliacao(expressao: Expressao): Int {
    if (expressao is Numero){
        return expressao.valor
    }

    if (expressao is Soma){
        return avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
    }

    throw IllegalArgumentException("Expressão é desconhecida!")
}

//Utilizando blocos como ramificações
fun avaliacao2(expressao: Expressao) =
    when(expressao) {
        is Numero -> expressao.valor
        is Soma -> avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
        else -> throw IllegalArgumentException("Expressão é desconhecida!")
    }

fun main(){
    // ((1 + 2) + 4)
    val resultado = avaliacao(Soma(Soma(Numero(1), Numero(2)), Numero(4)))
    println("Resultado 1: $resultado")

    val resultado2 = avaliacao2(Soma(Soma(Numero(1), Numero(2)), Numero(4)))
    println("Resultado 2: $resultado2")
}