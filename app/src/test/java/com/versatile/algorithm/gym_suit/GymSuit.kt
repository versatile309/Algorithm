package com.versatile.algorithm.gym_suit

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {

    //이미 체육복을 나눠 받은 학생
    val alreadySharedStudent = arrayListOf<Int>()

    return (1..n).fold(0,
        { answer, student ->
            when {
                //체육복을 잃어 버리지 않고 여분의 체육복이 없는 학생
                (!lost.contains(student) and !reserve.contains(student)) -> {
                    answer + 1
                }

                //체육복을 잃어버리고 여분의 체육복이 있는 학생
                (lost.contains(student) and reserve.contains(student)) -> {
                    answer + 1
                }

                //체육복을 잃어 버리지 않았고 여분의 체육복이 있는 학생
                (!lost.contains(student) and reserve.contains(student)) -> {
                    when {
                        (student != 1) and lost.contains(student-1) and !reserve.contains(student-1) and (!alreadySharedStudent.contains(student-1)) -> {
                            alreadySharedStudent.add(student-1)
                            answer + 2
                        }
                        (student != n) and lost.contains(student+1) and !reserve.contains(student+1) and (!alreadySharedStudent.contains(student+1))-> {
                            alreadySharedStudent.add(student+1)
                            answer + 2
                        }
                        else -> answer + 1
                    }
                }
                //체육복을 잃어 버리고 여분의 체육복이 없는 학생
                else -> {
                    answer
                }
            }
        })

}


class SolutionTest {


    @Test
    fun `get max students who get gym suit`() {
        assertThat(
            solution(5, intArrayOf(2, 4), intArrayOf(1, 3, 5))
        ).isEqualTo(5)

        assertThat(
            solution(5, intArrayOf(2, 4), intArrayOf(3))
        ).isEqualTo(4)

        assertThat(
            solution(3, intArrayOf(3), intArrayOf(1))
        ).isEqualTo(2)

        assertThat(
            solution(8, intArrayOf(2,3,4), intArrayOf(1))
        ).isEqualTo(6)

        assertThat(
            solution(8, intArrayOf(2,3,4), intArrayOf(5))
        ).isEqualTo(6)
    }
}