package math

class Matrix(private val matrix: Array<Array<Double>>) {
    override fun toString(): String {
        val stringResult = StringBuilder()
        matrix.forEachIndexed { _, rowValues ->
            rowValues.forEachIndexed { colIndex, value ->
                if (colIndex < rowValues.size - 1) {
                    stringResult.append("$value ")
                } else {
                    stringResult.append("$value\n")
                }
            }
        }
        return stringResult.toString()
    }
}