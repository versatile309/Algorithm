package com.versatile.algorithm.iron_stick

import org.assertj.core.api.Assertions
import org.junit.Test

fun solution(arrangement: String): Int {
    val tempList = arrangement.replace("()", "0")
    var stickCount = 0
    var result = 0

tempList.forEach {
    when (it) {
        '(' -> {
            stickCount += 1
            result += 1
        }
        ')' -> stickCount -= 1
        '0' -> result += stickCount
    }
}

    return result
}

class SolutionTest {


    @Test
    fun `get sum between two integer`() {
        Assertions.assertThat(
            solution("()(((()())(())()))(())")
        ).isEqualTo(17)

    }
}