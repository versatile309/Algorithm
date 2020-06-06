package com.versatile.algorithm.function_develop

import org.assertj.core.api.Assertions
import org.junit.Test
import java.util.*
import kotlin.collections.ArrayList

fun solution(progresses: IntArray, speeds: IntArray): IntArray {
    val answer = ArrayList<Int>()
    var progressQueue: Queue<Int> = LinkedList<Int>(progresses.toList())
    val speedQueue: Queue<Int> = LinkedList<Int>(speeds.toList())

    while (progressQueue.isNotEmpty()) {
        var count = 0

        if (progressQueue.size == 1) {
            answer.add(1)
            break
        }

        val currentSpeedQueue = speedQueue.toList()
        progressQueue = LinkedList<Int>(progressQueue.mapIndexed
        { index, i -> i + currentSpeedQueue[index] })

        while (progressQueue.isNotEmpty()) {

            if (progressQueue.peek()!! >= 100) {
                progressQueue.poll()
                speedQueue.poll()
                count += 1
            } else {
                break
            }

        }

        if (count != 0)
            answer.add(count)

    }

    return answer.toIntArray()
}

class SolutionTest {


    @Test
    fun `get function develop`() {
        Assertions.assertThat(
            solution(intArrayOf(93, 30, 55), intArrayOf(1, 30, 5))
        ).isEqualTo(intArrayOf(2, 1))

    }
}