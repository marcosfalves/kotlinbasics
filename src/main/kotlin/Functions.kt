fun main(args: Array<String>) {
    println(max(10, 7))
    println(max1(11, 17))
}

//Função com corpo de bloco
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//Função com corpo de expressão
fun max1(a: Int, b: Int) = if (a > b) a else b
