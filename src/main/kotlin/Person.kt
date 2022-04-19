class Person(
    val firstName: String,
    val lastName: String,
    var age: Int
) {
    fun birthday(){
        age++
    }

    fun introduceYourself() {
        println("Hi, I'm $firstName and I'm $age years old!")
    }
}

fun main() {
    val person1 = Person("Marcos", "Ferreira", 30)
    val person2 = Person("Juliana", "Alves", 27)

    person1.introduceYourself()
    person1.birthday()
    person1.introduceYourself()

    person2.introduceYourself()


    println("Person 1: ${person1.firstName}")
    println("Person 2: ${person2.firstName}")
}