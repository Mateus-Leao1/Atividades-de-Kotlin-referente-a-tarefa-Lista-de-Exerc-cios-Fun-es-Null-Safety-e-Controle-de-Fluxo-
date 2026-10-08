fun CalcularDesconto(x: String, y: Double){

    when (x) {
    "PROMO10" -> {
        var y = y-10
        println("\nVocê aplicou um cupom de R$10 OFF.")
        println("Sua conta ficou R$ $y")
        }

    "PROMO20" -> {
        var y = y-20
        println("\nVocê aplicou um cupom de R$20 OFF.")
        println("Sua conta ficou R$ $y")
        }

    else -> {
        println("\nSua conta ficou R$ $y")
        }
    }

}

fun main(){
    var produto = "TV"
    var valor_produto = 2500.0

    println("Insira o cupom do produto se disponivel: ")
    var cupom = readln().toString()

    CalcularDesconto(cupom, valor_produto)
}