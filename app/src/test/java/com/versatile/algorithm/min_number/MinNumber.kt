package com.versatile.algorithm.min_number


import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

fun solution(arr: IntArray): IntArray =
    if (arr.size == 1) intArrayOf(-1)
else arr.filter { it != arr.min() }.toIntArray()


class SolutionTest {

    @Test
    fun `get middle string`() {

        assertThat(solution(intArrayOf(4,3,2,1))).isEqualTo(intArrayOf(4,3,2))

        assertThat(solution(intArrayOf(10))).isEqualTo(intArrayOf(-1))
    }
}