fun main() {
    val name = "Marcos"
    println("Hello $name!")
    println("Hello \$name!") //escape

    println("A soma é: ${sum1(10, 20)}")
}

fun sum1(a: Int, b: Int) = a + b