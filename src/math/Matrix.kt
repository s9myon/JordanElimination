package math

class Matrix {
    private val value: Array<Array<Double>>
    val rows: Int
    val cols: Int

    constructor(matrix: Array<Array<Double>>) {
        rows = matrix.size
        cols = matrix[0].size
        value = matrix
    }

    constructor(matrix: Array<Array<Int>>) {
        rows = matrix.size
        cols = matrix[0].size
        val buffer: Array<Array<Double>> = Array(rows) { Array(cols) { 0.0 } }
        matrix.forEachIndexed { row, array ->
            array.forEachIndexed { col, elem ->
                buffer[row][col] = elem.toDouble()
            }
        }
        value = buffer
    }

    fun getElement(row: Int, col: Int) =
        value.forEachIndexed { i, array ->
            array.forEachIndexed { j, elem ->
                if (i == row && j == col) elem else 0.0
            }
        }

    fun setElement(value: Double, row: Int, col: Int) =
        this.value.forEachIndexed { i, array ->
            array.forEachIndexed { j, _ ->
                if (i == row && j == col) this.value[i][j] = value
            }
        }

    override fun toString(): String {
        val matrix = StringBuilder()
        value.forEachIndexed { _, array ->
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