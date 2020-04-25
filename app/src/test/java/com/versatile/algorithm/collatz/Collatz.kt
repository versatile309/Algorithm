package com.versatile.algorithm.collatz

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

fun solution(num: Int): Int {
    var currentNum = num.toLong()
    var count = 0
    while (currentNum != 1.toLong()){

        count += 1

        if (currentNum%2 ==0.toLong()){
            currentNum /= 2
        }else {
            currentNum = (currentNum*3) + 1
        }


        if (count == 500)
            return -1


    }

    return count
}


//재귀로 풀어보기
fun solution2(num: Int): Int {

    return getAnswer(num.toLong(),0)
}

fun getAnswer(n : Long, c: Int): Int {

    if (n == 1.toLong())
        return c
    else if(c == 500)
        return -1

    return getAnswer(if (n%2 == 0.toLong()) n/2 else n*3+1, c+1)
}


class SolutionTest {


    @Test
    fun `get collatz count`() {
        assertThat(solution(6)).isEqualTo(8)
        assertThat(solution(16)).isEqualTo(4)
        assertThat(solution(626331)).isEqualTo(-1)

        assertThat(solution2(6)).isEqualTo(8)
        assertThat(solution2(16)).isEqualTo(4)
        assertThat(solution2(626331)).isEqualTo(-1)

    }
}