package com.versatile.algorithm.factor_sum

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

fun solution(n: Int): Int {
//    return (1..n ).filter { n % it == 0 }.sum()

    return ((1..n/2 ).filter { n % it == 0 }.sum() + n)
}


class SolutionTest {


    @Test
    fun `get sum of factors`() {
        assertThat(
            solution(12)
        ).isEqualTo(28)

        assertThat(
            solution(5)
        ).isEqualTo(6)
    }
}