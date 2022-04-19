class CustomAccessor(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun main(){
    val square = CustomAccessor(15, 15)

    println(square.isSquare)
}

