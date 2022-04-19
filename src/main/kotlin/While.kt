fun main(){
    var temperatura: Int = 0
    var somatorio: Int = 0
    var quantidade: Int = 0

    while (temperatura != 999){
        println("Informe uma temperatura ou 999 para sair:")
        temperatura = readLine()!!.toInt();

        if (temperatura != 999){
            somatorio += temperatura
            quantidade++
        }
    }
    println("A média das temperaturas é ${somatorio/quantidade}")
}