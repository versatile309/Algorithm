package com.versatile.algorithm.average

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

fun solution(arr: IntArray): Double {
    return arr.average()
}



class SolutionTest {


    @Test
    fun `get average of int array`() {
        assertThat(solution(intArrayOf(1,2,3,4))).isEqualTo(2.5)
        assertThat(solution(intArrayOf(5,5))).isEqualTo(5.0)


    }
}