package com.versatile.algorithm.implement_stack_using_queues

import java.util.*

class MyStack() {

    /** Initialize your data structure here. */
    private var queue = LinkedList<Int>()


    /** Push element x onto stack. */
    fun push(x: Int) {
        if (queue.isEmpty()){
            queue.offer(x)
        } else {
            val tempQueue = LinkedList<Int>()
            tempQueue.offer(x)
            while (queue.isNotEmpty()) {
                tempQueue.offer(queue.poll())
            }
            queue = tempQueue
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    fun pop(): Int {
        return queue.poll()!!
    }

    /** Get the top element. */
    fun top(): Int {
        return queue.peek()!!
    }

    /** Returns whether the stack is empty. */
    fun empty(): Boolean {
        return queue.isEmpty()
    }

}

class MyStack2() {

    /** Initialize your data structure here. */
    private var queue = LinkedList<Int>()


    /** Push element x onto stack. */
    fun push(x: Int) {
        if (queue.isEmpty()){
            queue.offer(x)
        } else {
            val preQueueSize = queue.size
            queue.offer(x)
            for (i in 0 until preQueueSize) {
                queue.offer(queue.poll())
            }
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    fun pop(): Int {
        return queue.poll()!!
    }

    /** Get the top element. */
    fun top(): Int {
        return queue.peek()!!
    }

    /** Returns whether the stack is empty. */
    fun empty(): Boolean {
        return queue.isEmpty()
    }

}