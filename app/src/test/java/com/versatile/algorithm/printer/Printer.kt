package com.versatile.algorithm.printer

import org.assertj.core.api.Assertions
import org.junit.Test
import java.util.*

fun solution(priorities: IntArray, location: Int): Int {
    val progressQueue: Queue<Int> = LinkedList<Int>(priorities.toList())
    var count = 0
    var currentTargetPosition = location
    var max = progressQueue.max()

    while (progressQueue.isNotEmpty()) {
        val currentDoc = progressQueue.poll()
        if (max == currentDoc!!) {
            count += 1
            if (currentTargetPosition == 0) {
                break
            } else {
                currentTargetPosition -= 1
            }
            max = progressQueue.max()
        } else {
            progressQueue.add(currentDoc)
            if (currentTargetPosition == 0) {
                currentTargetPosition = progressQueue.size - 1
            } else {
                currentTargetPosition -= 1
            }
        }
    }
    return count
}

class SolutionTest {


    @Test
    fun `get printer`() {
        Assertions.assertThat(
            solution(intArrayOf(1, 2, 3), 0)
        ).isEqualTo(3)

        Assertions.assertThat(
            solution(intArrayOf(2, 1, 3, 2), 2)
        ).isEqualTo(1)

        Assertions.assertThat(
            solution(intArrayOf(1, 1, 9, 1, 1, 1), 0)
        ).isEqualTo(5)


    }
}