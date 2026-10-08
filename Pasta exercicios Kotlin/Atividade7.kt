fun verificarEmails(emails: List<String?>) {

    var contasInvalidas = 0

    for (email in emails) {

        if (email == null || (email?.length ?: 0) == 0) {
            contasInvalidas++
            println("Conta inválida: e-mail será apagado.")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Total de contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {

    val emails = listOf(
        "mateus@gmail.com",
        null,
        "",
        "teste@gmail.com",
        null,
        ""
    )

    verificarEmails(emails)
}