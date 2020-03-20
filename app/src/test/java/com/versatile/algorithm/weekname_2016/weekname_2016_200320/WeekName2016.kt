package com.versatile.algorithm.weekname_2016.weekname_2016_200320

import org.assertj.core.api.Assertions
import org.junit.Test

fun solution(a: Int, b: Int): String = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")[
            (arrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
                .filterIndexed { index, _ -> index <= a-1 }
                .foldIndexed(-1, { index, acc, i ->
                    if (index < a-1) acc + i
                    else acc + b
                }))%7
    ]



class SolutionTest {


    @Test
    fun `find week name`() {

        Assertions.assertThat(
            solution(1,1)
        ).isEqualTo("FRI")

        Assertions.assertThat(
            solution(1,7)
        ).isEqualTo("THU")

        Assertions.assertThat(
            solution(5,24)
        ).isEqualTo("TUE")

    }
}