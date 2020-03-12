package com.versatile.algorithm.middle_string

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

fun solution(s: String): String {


    return when (s.length % 2) {
        0 ->  s.substring(s.length/2 -1, (s.length/2) + 1)
        else -> s[s.length/2].toString()
    }
}

class SolutionTest {

    @Test
    fun `get middle string`() {

        assertThat(solution("abcde")).isEqualTo("c")

        assertThat(solution("qwer")).isEqualTo("we")
    }
}