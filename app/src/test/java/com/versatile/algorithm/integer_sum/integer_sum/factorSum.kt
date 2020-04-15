package com.versatile.algorithm.integer_sum.integer_sum

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

fun solution(a: Int, b: Int): Long {

    return when (a <= b) {
        true -> (a..b).fold(0L, {total, next -> total + next})
        else -> (b..a).fold(0L, {total, next -> total + next})
    }
}


class SolutionTest {


    @Test
    fun `get sum between two integer`() {
        assertThat(
            solution(3, 5)
        ).isEqualTo(12)

        assertThat(
            solution(3, 3)
        ).isEqualTo(3)

        assertThat(
            solution(5, 3)
        ).isEqualTo(12)
    }
}