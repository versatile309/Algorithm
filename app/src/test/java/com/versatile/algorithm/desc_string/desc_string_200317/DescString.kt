package com.versatile.algorithm.desc_string.desc_string_200317

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

fun solution(s: String): String = String(s.toCharArray().sortedArrayDescending())



class SolutionTest {


    @Test
    fun `get string descending`() {
        assertThat(solution("Zbcdefg")).isEqualTo("gfedcbZ")
    }
}