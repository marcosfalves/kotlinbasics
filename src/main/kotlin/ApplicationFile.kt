fun main (args: Array<String>) {
    val firstName: String = "Marcos"
    val lastName = "Ferreira Alves"

    val person = Person("Juliana", "Alves", 27)

    println("Hello $firstName $lastName!")
    println("Hello ${person.firstName} ${person.lastName}!")

    print("A soma de 15 + 21 é ${sum(15 ,21)}")
}

fun sum(a: Int, b: Int) : Int {
    return a + b;
}