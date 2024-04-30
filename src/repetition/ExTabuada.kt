package repetition

/**
 * EXERCÍCIO
 * ---------
 *
 * Imprima na tela a tabuada de um número de 1 a 10. O número deve ser fornecido pelo usuário
 */
fun main() {

    print("> ")
    var num = readln().toInt()

    var i = 1
    val max = 15

    while (i <= max) {
        println("$num x $i = ${num * i++}")
        i++
    }
}