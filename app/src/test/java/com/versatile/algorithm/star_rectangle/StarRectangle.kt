package com.versatile.algorithm.star_rectangle

import org.junit.Test

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    (1..b).forEach { _ ->
        repeat((1..a).count()) {
            print("*")
        }
        println()
    }
}


class SolutionTest {


    @Test
    fun `star rectangle`() {
        main(arrayOf())

    }
}
