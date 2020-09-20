package com.versatile.algorithm.best_time_to_buy_and_sell_stock

import org.assertj.core.api.Assertions
import org.junit.Test

fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0

    prices.forEachIndexed { index, i ->
        if (index < prices.size -1 && i < prices[index + 1]) {
            for (innerIndex in index + 1 until prices.size) {

                if (prices[innerIndex] - i > maxProfit) {
                    maxProfit = prices[innerIndex] - i
                }
            }
        }
    }

    return maxProfit
}

class SolutionTest {

    @Test
    fun `get max profit`() {
        Assertions.assertThat(maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))).isEqualTo(5)

        Assertions.assertThat(maxProfit(intArrayOf(7, 6, 4, 3, 1))).isEqualTo(0)
    }
}