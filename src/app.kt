import math.Matrix
import math.solveEquationSystemByJordanElimination

fun main() {
    val matrix = arrayOf(
        arrayOf(2.0, -3.0),
        arrayOf(-4.0, 3.0)
    )
    println(Matrix(matrix))
    val resultMatrix = solveEquationSystemByJordanElimination(matrix)
    println(Matrix(resultMatrix))
}