fun rotas(lista: MutableList<String?>): MutableList<String?> {
    var lista_modificada = lista

    for ((i, j) in lista_modificada.withIndex()){
        lista_modificada[i] = j ?: "Endereço desconhecido"
    }

    return lista_modificada
}


fun main() {
    var lista_inicial = mutableListOf<String?>(null, "Av. Mario Ypiranga", "Av. Djalma Batista", null, "R.Gurupi", "Av. Constantinopla")
    var nova_lista = rotas(lista_inicial)

    for ((i, j) in nova_lista.withIndex()){

        var rota = i+1
        if (j == "Endereço desconhecido"){
            println("ROTA $rota -> Entrega Pendente: Falta de dados")
        }else{
            println("ROTA $rota -> Rota traçada para: $j")
         }
    }
}