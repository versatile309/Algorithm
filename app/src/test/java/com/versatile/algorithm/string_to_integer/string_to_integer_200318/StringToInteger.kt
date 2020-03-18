package com.versatile.algorithm.string_to_integer.string_to_integer_200318
import org.assertj.core.api.Assertions
import org.junit.Test

fun solution(s: String): Int = s.toInt()


class SolutionTest {


    @Test
    fun `string to integer`() {
        Assertions.assertThat(
            solution("12345")
        ).isEqualTo(12345)

        Assertions.assertThat(
            solution("-12345")
        ).isEqualTo(-12345)
    }
}