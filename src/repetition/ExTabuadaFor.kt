package repetition

/**
 * EXERCÍCIO
 * ---------
 *
 * Imprima na tela a tabuada de um número de 1 a 10. O número deve ser fornecido pelo usuário
 * Utilize a estrutura de repetição dor para resolver esse exercício.
 */
fun main() {

    print("> ")
    val num = readln().toInt()
    val max = 10

    for (i in 1..max) {
        println("$num x $i = ${num * i}")
    }
}