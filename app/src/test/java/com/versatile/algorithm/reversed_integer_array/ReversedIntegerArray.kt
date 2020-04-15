package com.versatile.algorithm.reversed_integer_array

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import kotlin.math.max
import kotlin.math.min

fun solution(n: Long): IntArray {
    return n.toString().map { it.toString().toInt() }.reversed().toIntArray()
}


class SolutionTest {


    @Test
    fun `get reversed integer array`() {
        assertThat(
            solution(12345)
        ).isEqualTo(intArrayOf(5,4,3,2,1))


    }
}