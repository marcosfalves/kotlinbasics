package br.com.mfalves.model

import java.util.function.Predicate
import kotlin.jvm.internal.Intrinsics

data class Person(
    val id: Long,
    var firstName: String,
    var lastName: String,
    var country: String
) {
    fun getFullName() = "$firstName $lastName"

    override fun equals(other: Any?): Boolean {
        return if (this !== other) {
            if (other is Person) {
                if (id == other.id) {
                    return true
                }
            }
            false
        } else {
            true
        }
    }
}

fun main() {
    val person1 = Person(1L, "José", "da Silva", "Brasil")
    val person2 = Person(1L, "Marcos", "Ferreira Alves", "Brasil")
    val person3 = Person(1L, "João", "Oliveira", "Brasil")
    val person4 = Person(1L, "Maria", "Alves", "Brasil")

    val listPerson: List<Person> = mutableListOf(person1, person2, person3, person4)

    listPerson.stream()
        .filter{t -> t.lastName.contains("Alves")}
        .map{ it.lastName }
        .forEach { it -> println(it.uppercase())}

    listPerson.isEmpty();
    listPerson.first();
    listPerson.last();

    println(person1 == person2)

    val (id, firstName, country, lastName) = person2
    println("id: $id, fName: $firstName, lName: $lastName, Country: $country")
    println(person2.component1())
    println(person2.component2())
    println(person2.component3())
    println(person2.component4())

    println(person2)
}
