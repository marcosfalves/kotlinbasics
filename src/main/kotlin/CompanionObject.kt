class Button private constructor(val id: Int, color: Int){
    companion object Factory {
        var currentId = 0
        fun newButton(color: Int) : Button {
            currentId += 1
            return Button(currentId, color)
        }
    }
}

fun main() {
    val blue = Button.newButton(255)
    println(blue.id)

    val yellow = Button.newButton(0)
    println(yellow.id)

}