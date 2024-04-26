package selection

/**
 * EXERCÍCIO
 * ---------
 *
 * Escreva um programa que receba um valor numérico pelo teclado, multiplica por ele mesmo e imprima o resultado.
 * Entretanto, se o valor fornecido for maior que 10, ele deve ser ajustado para 10 antes ser multiplicado.
 */
fun main() {

    print("> ")
    var valor = readln().toInt()

    if (valor > 10) {
        valor = 10
    }

    valor *= valor
    println(valor)

}