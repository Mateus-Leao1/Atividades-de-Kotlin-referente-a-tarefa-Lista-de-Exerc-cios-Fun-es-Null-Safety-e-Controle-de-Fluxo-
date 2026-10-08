fun main() {
    print("Nota da corrida(de 1 a 5): ")
    var nota_uber: Int = readlnOrNull()?.toIntOrNull() ?: 0

    when (nota_uber){
    5 -> println("Excelente corrida!")
    4 -> println("Boa corrida.")
    3,2,1 -> println("Precisamos melhorar.")
    0 -> println("Nenhuma avaliação fornecida.")
    }

}