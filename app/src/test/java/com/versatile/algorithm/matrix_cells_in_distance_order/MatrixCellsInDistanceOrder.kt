package com.versatile.algorithm.matrix_cells_in_distance_order

import org.assertj.core.api.Assertions
import org.junit.Test
import kotlin.math.abs

//Runtime: 412 ms, faster than 60.00% of Kotlin online submissions for Matrix Cells in Distance Order.
//Memory Usage: 40.5 MB, less than 40.00% of Kotlin online submissions for Matrix Cells in Distance Order.
fun allCellsDistOrder(R: Int, C: Int, r0: Int, c0: Int): Array<IntArray> {

    return createMatrix(R, C).sortedBy {
        abs(r0 - it[0]) + abs(c0 - it[1])
    }.toTypedArray()
}

fun createMatrix(R: Int, C: Int): Array<IntArray> {

    val result = Array(R*C) { intArrayOf()}
    var index = 0

    for (i in 0 until R) {
        for (j in 0 until C) {
            result[index] = intArrayOf(i, j)
            index += 1
        }
    }

    return result
}

class SolutionTest {


    @Test
    fun `Matrix Cells in Distance Order`() {
        Assertions.assertThat(
            allCellsDistOrder(1, 2, 0, 0)
        ).isEqualTo(arrayOf(intArrayOf(0, 0), intArrayOf(0, 1)))

        Assertions.assertThat(
            allCellsDistOrder(2, 2, 0, 1)
        ).isEqualTo(arrayOf(intArrayOf(0, 1), intArrayOf(0, 0), intArrayOf(1, 1), intArrayOf(1, 0)))

    }
}