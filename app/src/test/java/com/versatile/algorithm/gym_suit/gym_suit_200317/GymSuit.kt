package com.versatile.algorithm.gym_suit.gym_suit_200317

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {

    var answer = n
    val lostSet = lost.toSet() - reserve.toSet()
    val reserveSet = (reserve.toSet() - lost.toSet()) as MutableSet

    lostSet.forEach {
        when {
            it + 1 in reserveSet -> reserveSet.remove(it + 1)
            it - 1 in reserveSet -> reserveSet.remove(it - 1)
            else -> answer--
        }
    }
    return answer

}


class SolutionTest {


    @Test
    fun `get max students who get gym suit`() {
        assertThat(
            solution(
                5,
                intArrayOf(2, 4),
                intArrayOf(1, 3, 5)
            )
        ).isEqualTo(5)

        assertThat(
            solution(
                5,
                intArrayOf(2, 4),
                intArrayOf(3)
            )
        ).isEqualTo(4)

        assertThat(
            solution(
                3,
                intArrayOf(3),
                intArrayOf(1)
            )
        ).isEqualTo(2)

        assertThat(
            solution(
                8,
                intArrayOf(2, 3, 4),
                intArrayOf(1)
            )
        ).isEqualTo(6)

        assertThat(
            solution(
                8,
                intArrayOf(2, 3, 4),
                intArrayOf(5)
            )
        ).isEqualTo(6)
    }
}