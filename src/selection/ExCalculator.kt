package selection

/**
 * EXERCÍCIO
 * ---------
 *
 * Implemente uma calculadora capaz de executar 4 operações básicas e que receba os dados via teclado.
 * Três informações devem ser passadas: o primeiro operando, a operação matemática e o segundo operando.
 * Por exemplo:
 * > 20
 * > +
 * > 4
 * > Resultado: 24
 */
fun main() {

    print("> ")
    val v1 = readln().toDouble()

    print("> ")
    val op = readln()[0]

    print("> ")
    val v2 = readln().toDouble()

    val result = when (op) {
        '+' -> v1 + v2
        '-' -> v1 - v2
        '*' -> v1 * v2
        '/' -> v1 / v2
        else -> 0
    }

    println("Resultado: $result")
}