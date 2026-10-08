fun validarBioInfantil(Bio: String){

    var quantidade_de_caracteres = 0
    for (i in Bio){
        quantidade_de_caracteres += 1
    }

    if (quantidade_de_caracteres <= 50){
        println("Bio ACEITA.")
    }else{
        println("Bio muito longa, precisa diminui-la.")
    }
}

fun main() {
    print("Biografia: ")
    val biografia = readln()

    validarBioInfantil(biografia)
}
