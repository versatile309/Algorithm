package com.versatile.algorithm.biggest_num

import org.assertj.core.api.Assertions
import org.junit.Test

fun solution(numbers: IntArray): String {
    if (numbers.all { it == 0 })
        return "0"

    return numbers.map { it.toString() }
        .sortedWith(Comparator{a, b ->
            when {
                a.plus(b) > b.plus(a) -> -1
                a.plus(b) < b.plus(a) -> 1
                else -> 0
            }
        }).joinToString(separator = "")

}



class SolutionTest {

    @Test
    fun `get biggest number`() {
        Assertions.assertThat(solution(intArrayOf(6,10,2))).isEqualTo("6210")

        Assertions.assertThat(solution(intArrayOf(3, 30, 34, 5, 9))).isEqualTo("9534330")

        Assertions.assertThat(solution(intArrayOf(0,0,0))).isEqualTo("0")
    }
}