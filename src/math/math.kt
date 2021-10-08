package math

fun solveEquationSystemByJordanElimination(matrix: Array<Array<Double>>) : Array<Array<Double>> {
    fun executeJordanEliminationStep(matrix: Array<Array<Double>>, row: Int, col: Int) : Array<Array<Double>> {
        val value = matrix[row][col]
        val matrixBuffer = Array(matrix.size) {Array(matrix[0].size) { 0.0 } }
        for (i in matrix.indices) {
            for (j in matrix[0].indices) {
                when {
                    i != row && j != col -> {
                        println("(${matrix[i][j]} * ${matrix[row][col]} - ${matrix[i][col]} * ${matrix[row][j]}) / $value")
                        matrixBuffer[i][j] = (matrix[i][j] * matrix[row][col] - matrix[i][col] * matrix[row][j]) / value
                    }
                    i != row && j == col -> {
                        matrixBuffer[i][j] = matrix[i][col] / value
                    }
                    i == row && j != col -> {
                        matrixBuffer[i][j] = - matrix[i][j] / value
                    }
                    i == row && j == col -> {
                        matrixBuffer[i][j] = 1 / value
                    }
                }
            }
        }
        return matrixBuffer
    }
    return executeJordanEliminationStep(matrix, 0, 0)
}