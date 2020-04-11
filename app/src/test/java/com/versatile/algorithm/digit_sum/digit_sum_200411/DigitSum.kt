package com.versatile.algorithm.digit_sum.digit_sum_200411
import org.assertj.core.api.Assertions
import org.junit.Test

fun solution(n: Int): Int {

    var result = 0

    n.toString().forEach {
        result += it.toString().toInt()
    }

    return result
}


class SolutionTest {


    @Test
    fun `get digit sum`() {
        Assertions.assertThat(
            solution(123)
        ).isEqualTo(6)

    }
}