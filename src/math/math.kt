package math

fun solveEquationSystemByJordanElimination(matrix: Matrix) {

    fun executeJordanEliminationStep(permittingElement: Double, row: Int, col: Int, matrix: Matrix) : Matrix {
        var value = 0.0
        for (i in 0 until matrix.rows) {
            for (j in 0 until matrix.cols) {
                when {
                    i != row && j != col -> {
                        value = (matrix.getElement(i, j))
                        matrix.setElement()
                    }
                }
            }
        }
    }
}