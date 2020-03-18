package com.versatile.algorithm.find_kim.find_kim_200318

import org.assertj.core.api.Assertions
import org.junit.Test

fun solution(seoul: Array<String>): String =
    "김서방은 ${seoul.indexOf("Kim")}에 있다"



class SolutionTest {


    @Test
    fun `find kim's position`() {
        Assertions.assertThat(
            solution(arrayOf("Jane", "Kim"))
        ).isEqualTo("김서방은 1에 있다")

    }
}