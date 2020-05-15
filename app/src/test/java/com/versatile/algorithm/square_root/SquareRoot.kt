package com.versatile.algorithm.square_root

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import kotlin.math.*

fun solution(n: Long): Long {
    val sqrt = sqrt(n.toDouble()).toLong()
    return if (sqrt * sqrt == n)
        (sqrt + 1) * (sqrt + 1)
    else
        -1
}


class SolutionTest {


    @Test
    fun `get square root`() {
        assertThat(
            solution(121)
        ).isEqualTo(144)

        assertThat(
            solution(3)
        ).isEqualTo(-1)


    }
}