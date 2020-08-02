package com.versatile.algorithm.hide_phone_num

import org.assertj.core.api.Assertions
import org.junit.Test


fun solution(phone_number: String): String {
    var answer = ""

    phone_number.forEachIndexed { index, c ->
        if (index < phone_number.length - 4) {
            answer += "*"
        } else {
            answer += c
        }
    }

    return answer
}


class SolutionTest {

    @Test
    fun `get integer descending`() {
        Assertions.assertThat(
            solution("01033334444")
        ).isEqualTo("*******4444")

    }
}