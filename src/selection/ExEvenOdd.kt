package selection

/**
 * Exercício
 * ---------
 *
 * Escreva um programa que recebe um valor fornecido pelo teclado e diz se ele é par ou ímpar.
 */
fun main() {

    print("> ")
    val num = readln().toInt()

    val type: String
    if (num % 2 == 0) {
        type = "PAR"
    } else {
        type = "ÍMPAR"
    }
    println(type)
}