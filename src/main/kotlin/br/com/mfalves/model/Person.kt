package br.com.mfalves.model

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
    val person1 = Person(1L, "Marcos", "Ferreira Alves", "Brasil")
    val person2 = Person(1L, "Marcos ", "Ferreira Alves", "Brasil")

    println(person1 == person2)

    val (id, firstName, country, lastName) = person2
    println("id: $id, fName: $firstName, lName: $lastName, Country: $country")
    println(person2.component1())
    println(person2.component2())
    println(person2.component3())
    println(person2.component4())

    println(person2)
}
