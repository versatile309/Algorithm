package com.versatile.algorithm.harshad_number

import org.assertj.core.api.Assertions
import org.junit.Test
fun solution(x: Int): Boolean = x.rem(x.toString()
       .toCharArray()
       .map { it.toString().toInt() }
       .fold(0, {total, num -> total + num})) == 0

class SolutionTest {

    @Test
    fun `get integer descending`() {
        Assertions.assertThat(
            solution(10)
        ).isEqualTo(true)

        Assertions.assertThat(
            solution(12)
        ).isEqualTo(true)

        Assertions.assertThat(
            solution(11)
        ).isEqualTo(false)

        Assertions.assertThat(
            solution(13)
        ).isEqualTo(false)
    }
}