package com.versatile.algorithm.pascals_triangle

import org.assertj.core.api.Assertions
import org.junit.Test
import kotlin.math.round

fun generate(numRows: Int): List<List<Int>> {

    if (numRows == 0) {
        return listOf()
    }

    if (numRows == 1) {
        return listOf(listOf(1))
    }

    val initList = intArrayOf(1)
    val resultList = ArrayList<List<Int>>()
    var preRowList = initList

    resultList.add(initList.toList())

    for (i in 1 until numRows ) {
        val row = ArrayList<Int>()
        for (j in 0 until round((i/2).toFloat()).toInt() + 1) {
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

        resultList.add(row)
        preRowList = row.toIntArray()
    }

    return resultList.toList()
}

class SolutionTest {

    @Test
    fun `get pascal's triangle`() {

        Assertions.assertThat(generate(5))
            .isEqualTo(
                listOf(
                    listOf(1),
                    listOf(1, 1),
                    listOf(1, 2, 1),
                    listOf(1, 3, 3, 1),
                    listOf(1, 4, 6, 4, 1)
                )
            )

    }
}