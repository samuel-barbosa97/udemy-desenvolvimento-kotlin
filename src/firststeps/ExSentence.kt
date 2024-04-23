package firststeps

/**
 * EXERCÍCIO
 * ---------
 *
 * Solicite 3 informações ao usuário: nome, idade, peso. Depois imprima uma frase que contenha essas
 * Informações (use String templates para montar a frase
 */
fun main() {

    print("Digite seu nome: ")
    val name = readln()

    print("Digite sua idade: ")
    val age = readln().toInt()

    print("Digite seu peso: ")
    val weight = readln().toDouble()

    println("O seu nome é $name. Você tem $age anos e o seu peso é $weight kilos.")
}