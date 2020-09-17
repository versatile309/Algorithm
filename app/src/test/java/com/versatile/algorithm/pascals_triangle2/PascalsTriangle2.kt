package com.versatile.algorithm.pascals_triangle2

import org.assertj.core.api.Assertions
import org.junit.Test

fun getRow(rowIndex: Int): List<Int> {

    val initList = intArrayOf(1)

    if (rowIndex == 0) {
        return initList.toList()
    }

    var preRowList = initList

    for (i in 1 until rowIndex + 1) {
        val row = ArrayList<Int>()
        for (j in 0 until ((i/2) + 1)) {
            if (j == 0 || j == i) {
                row.add(1)
            } else {
                row.add(preRowList[j - 1] + preRowList[j])
            }
        }

        if (i.rem(2) != 0) {
            row.addAll(row.reversed())
        } else {
            row.addAll(row.subList(0, row.size -1).reversed())
        }
        preRowList = row.toIntArray()
    }

    return preRowList.toList()
}

class SolutionTest {

    @Test
    fun `get pascal's triangle row`() {

        Assertions.assertThat(getRow(3))
            .isEqualTo(
                listOf(1, 3, 3, 1)
            )

    }
}