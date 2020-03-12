package com.versatile.algorithm.kth_number

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

fun solution(array: IntArray, commands: Array<IntArray>) : IntArray {

    var result = intArrayOf()

    commands.forEach {
       result = result.plus(array.copyOfRange(it[0]-1, it[1]).sortedArray()[it[2]-1])
    }

    return result
}


class SolutionTest {


    @Test
    fun `find kth number list`() {
        assertThat(
            solution(
                intArrayOf(1,5,2,6,3,7,4),
                arrayOf(intArrayOf(2,5,3), intArrayOf(4,4,1), intArrayOf(1,7,3)))
        ).isEqualTo(intArrayOf(5,6,3))
    }
}