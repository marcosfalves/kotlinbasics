import java.io.BufferedInputStream
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.Exception
import java.lang.NumberFormatException
import kotlin.IllegalArgumentException

fun main() {
    try {
        val porcentagem = porcentagem(150)
        println(porcentagem)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    lerIdade()
}

fun porcentagem(numero: Int): String {
    return if (numero in 1..100) {
        "$numero%"
    } else {
        throw IllegalArgumentException("Número deve estar entre 1 e 100.")
    }
}

fun lerIdade() {
    val reader = FileReader(File("src/main/resources/idades.txt"))
    val buffer = BufferedReader(reader)

    try {
        while (buffer.ready()){
            try {
                val numero = buffer.readLine()
                println(Integer.parseInt(numero))
            } catch (e: NumberFormatException) {
                println("Erro na conversão da linha")
            }
        }
    } catch (e: Exception) {
        println("Erro na leitura do arquivo!")
    } finally {
        buffer.close()
    }
}