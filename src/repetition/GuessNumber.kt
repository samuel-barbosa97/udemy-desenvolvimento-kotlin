package repetition

import kotlin.random.Random

/**
 * EXERCÍCIO
 * ---------
 *
 * Crie um jogo de adivinhação numérica. O computador deve sortear um número aleatório dentro de um intervalo e você
 * deve tentar descobri-lo. A cada tentativa, o programa diz se o número é maior ou menor doi que o número tentado.
 * O jofo acaba quando o número tentado for o número correto.
 */
fun main() {

    val secret = Random.nextInt(0, 101)

    while (true) {
        print("> ")
        val number = readln().toInt()

        when {
            number > secret -> println("O número sorteado é menor")
            number < secret -> println("O número sorteado é maior")
            else -> {
                println("Parabéns você acertou, que era $number")
                break
            }
        }
    }
}