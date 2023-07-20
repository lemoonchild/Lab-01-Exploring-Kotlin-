// Laboratorio 02 Kotlin - Sección 20
// Madeline Nahomy Castro Morales 22473

fun calcularPromedio(numbers: Array<Int>) {

    val promedio = numbers.average()

    println("--------------------------")
    println("El promedio de los números es: %.2f".format(promedio))
    println("--------------------------")
}

fun filterNums(arrayNums: Array<Int>){

    val numerosImpares = arrayNums.filter { it % 2 != 0 }
    println("La lista de números impares es la siguiente: $numerosImpares")
    println("--------------------------")
}

fun isPalindrome(words: String) {

    val charArray = words.toCharArray()

    val chainArray = charArray.map { it.toString() }.toTypedArray()

    val chainReversed = chainArray.reversed().toTypedArray()

    val areEqual = chainArray.contentEquals(chainReversed)

    if (areEqual) {
        println("La palabra ingresada es palíndromo.")
        println("--------------------------")
    } else {
        println("La palabra ingresada no es palíndromo.")
        println("--------------------------")
    }
}

fun sayhello(){

}
fun performOperation(){

}

fun main() {

    val arrayNums = arrayOf(1,3,4,6,7,8,9,20,12,34,20,5)
    calcularPromedio(arrayNums)
    filterNums(arrayNums)

    val words = "radar"
    isPalindrome(words)
}