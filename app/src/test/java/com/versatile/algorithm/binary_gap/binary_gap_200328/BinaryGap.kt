package com.versatile.algorithm.binary_gap.binary_gap_200328

import org.assertj.core.api.Assertions
import org.junit.Test

fun solution(N: Int): Int {

    val binaryNum = Integer.toBinaryString(N)
    var max = 0
    var current = 0
    var flag = 0

    binaryNum.forEach {
        if (it == '1'){
            flag += 1
        }

        if (flag == 1 && it == '0'){
            current += 1
        }else if (flag == 2){
            max = maxOf(max, current)
            current = 0
            flag = 1
        }
    }

    return max
}


class SolutionTest {


    @Test
    fun `get binary gap`() {
        Assertions.assertThat(
            solution(9)
        ).isEqualTo(2)

        Assertions.assertThat(
            solution(32)
        ).isEqualTo(0)

    }
}