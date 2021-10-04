package math

class Matrix {
    private val element: Array<Array<Double>>
    private val rows: Int
    private val cols: Int

    constructor(matrix: Array<Array<Double>>) {
        rows = matrix.size
        cols = matrix[0].size
        element = matrix
    }

    constructor(matrix: Array<Array<Int>>) {
        rows = matrix.size
        cols = matrix[0].size
        val buffer: Array<Array<Double>> = Array(rows) { Array(cols) { 0.0 } }
        matrix.forEachIndexed { row, array ->
            array.forEachIndexed { col, value ->
                buffer[row][col] = value.toDouble()
            }
        }
        element = buffer
    }

    override fun toString(): String {
        val matrix = StringBuilder()
        element.forEachIndexed { _, array ->
            array.forEachIndexed { col, value ->
                if (col < cols - 1) {
                    matrix.append("$value ")
                } else {
                    matrix.append("$value \n")
                }
            }
        }
        return matrix.toString()
    }
}