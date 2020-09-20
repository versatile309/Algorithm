package com.versatile.algorithm.best_time_to_buy_and_sell_stock2

import org.assertj.core.api.Assertions
import org.junit.Test

fun maxProfit(prices: IntArray): Int {
    var profit = 0
    var myStock = -1

    prices.forEachIndexed { index, i ->

        if (index < prices.size - 1 && i < prices[index + 1] && myStock == -1) {
        myStock = i
        } else if (myStock != -1) {
            if (index == prices.size - 1 || prices[index] > prices[index + 1]) {
                profit += prices[index] - myStock
                myStock = -1
            }

        }
    }

    return profit
}

class SolutionTest {

    @Test
    fun `get max profit`() {
        Assertions.assertThat(maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))).isEqualTo(7)

        Assertions.assertThat(maxProfit(intArrayOf(1,2,3,4,5))).isEqualTo(4)

        Assertions.assertThat(maxProfit(intArrayOf(7, 6, 4, 3, 1))).isEqualTo(0)

        Assertions.assertThat(maxProfit(intArrayOf(2, 1, 2, 0, 1))).isEqualTo(2)
    }
}