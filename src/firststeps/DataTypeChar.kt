package firststeps

fun main() {

    val c: Char = 'A'
    println(c)
    println(c.code)

    var i = 65
    println(i.toChar().inc().dec())

    val c2 = '1'
    println(c2.isDigit())
    println(c2.isUpperCase())
    println(c2.digitToInt())
}