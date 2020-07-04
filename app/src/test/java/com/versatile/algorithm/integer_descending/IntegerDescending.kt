package com.versatile.algorithm.integer_descending

import org.assertj.core.api.Assertions
import org.junit.Test

fun solution(n: Long): Long {
    return n.toString()
        .toCharArray()
        .sortedArrayDescending()
        .joinToString("")
        .toLong()
}

class SolutionTest {

    @Test
    fun `get integer descending`() {
        Assertions.assertThat(
            solution(118372)
        ).isEqualTo(873211)

    }
}