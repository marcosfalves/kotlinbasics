package br.com.mfalves.collections

class Order(val lines: List<OrderLine>)
class OrderLine(val name: String, val price: Int)

fun main() {
    mapExample()
    flatMapExample()
}

fun mapExample(){
    val order = Order(
        listOf(OrderLine("Tomato", 2), OrderLine("Garlic", 3), OrderLine("Chives", 2))
    )
    val names = order.lines.map { it.name }
    println(names)

    val totalPrice = order.lines.map { it.price }.sum()
    println("Total price: $totalPrice")

}

fun flatMapExample(){
    val orders = listOf(
        Order(listOf(OrderLine("Garlic", 1), OrderLine("Chives", 2))),
        Order(listOf(OrderLine("Tomato", 1), OrderLine("Garlic", 2))),
        Order(listOf(OrderLine("Potato", 1), OrderLine("Chives", 2))),
    )

    //Com map, retorna uma lista com lista
    val list: List<List<OrderLine>> = orders.map { it.lines }
    println(list)

    //Com flatMap nivela  List<OrderLine>  para  OrderLine individuais
    val lines: List<OrderLine> = orders.flatMap { it.lines }
    val names = lines.map { it.name }.distinct()
    println(names)

}