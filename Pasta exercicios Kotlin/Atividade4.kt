fun main() {
    var lista_transacoes = mutableListOf<Double?>(50.0, null, 120.5, null, 10.0)

    var valor_total = 0.0
    for (i in lista_transacoes){

        if (i != null){
            valor_total += i
            println("Valor adicionado de R$ $i")
        }else{
            println("Transição ignorada")
         }

    }

    print("\nVALOR TOTAL: R$ $valor_total")
}