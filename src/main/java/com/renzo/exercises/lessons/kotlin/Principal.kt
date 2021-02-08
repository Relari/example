package com.renzo.exercises.lessons.kotlin

// Constants
const val MIN_LETTERS = 2

fun main() {

    // Imprimir por consola
    println("Hola Mundo")

    // Variables que se pueden modificar
    var messaje = "Hola Mundo"
    println(messaje)

    // Variables de solo lectura
    val name = "Renzo"
    println("Hola $name")

    // Funciones
    printHeader("Declarando funciones")

    val sum = sumOfTwoNumbers(12, 8)
    println("La suma es : $sum")

    val isEquals = validate("Re")
    println(isEquals)

    if (isEquals) {
        println("Es verdadero")
    } else {
        println("Es falso")
    }

    val numbers = intArrayOf(1,2,3,4,5,6)

    for (number: Int in numbers) println(number)

    println("**** -> For")
    for (i in 1..10) println(i)

    println("**** -> While")
    var i = 10
    while (i > 0) {
        println(i)
        i--
    }

    println("**** -> Do While")

    var q = 10
    do {
        println(q)
        q--
    } while (q > 0)
}

fun printHeader(titulo: String) {
    println("***************************************")
    println("*** $titulo")
    println("***************************************")
}

fun validate(name: String): Boolean {
    return MIN_LETTERS < name.length
}

fun sumOfTwoNumbers(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}