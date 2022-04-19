package br.com.mfalves.collections

import br.com.mfalves.model.Person

/**
           Immutable          Mutable
List      listOf<T>()      mutableListOf<T>()
Set       setOf<T>()       mutableSetOf<T>()
Map       mapOf<K,V>()     mutableMapOf<K,V>()
* */

fun main () {
    //testList()
    //testSet()
    testMap()
}

//key,value list element
fun testMap() {
    println("---------------- Map Immutable ----------------")
    val students = mapOf<Int, String>(10 to "Marcos", 20 to "Juliana", 30 to "João")
    println(students[10]) //key number, not position

    students.forEach { t, u ->
        println("$t and $u")
    }

    println("---------------- Map Mutable ----------------")
    val students1 = mutableMapOf<Int, String>(10 to "Marcos", 20 to "Juliana", 30 to "João")
    students1.remove(30)
    students1[40] = "New Element"

    students1.forEach { t, u ->
        println("$t and $u")
    }

}

//Unique Element
fun testSet() {
    println("---------------- Set Immutable ----------------")
    val names = setOf<String>("Marcos", "Marcos", "Marcia", "Juliana", "Marcia")
    names.forEach { println(it) }
    println()
    for (n in names){
        println(n)
    }


    println("---------------- Set Mutable ----------------")
    val names1 = mutableSetOf<String>("Marcos", "Marcos", "Marcia", "Juliana", "Marcia")
    names1.add("Maria")
    names1.forEach { println(it) }
    names1.remove("Marcos")
    println()
    for (n in names1){
        println(n)
    }
}

fun testList() {
    println("---------------- List Immutable ----------------")
    val names = listOf<String>("Marcos", "Juliana", "Marcia")
    println(names)
    println()
    println(names[1])
    println()
    for (n in names) {
        println(n)
    }
    println()
    names.forEach { println(it) }

    println("---------------- List Mutable ----------------")
    val names1 = mutableListOf<String>("José")
    names1.add("Maria")
    names1.add("João")

    println(names1)
    println()
    println(names1[1])
    println()
    for (n in names1) {
        println(n)
    }
    println()
    names1.forEach { println(it) }
}