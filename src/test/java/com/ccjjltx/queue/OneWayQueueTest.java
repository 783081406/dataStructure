package com.ccjjltx.queue;

import org.junit.Test;

public class OneWayQueueTest {
    @Test
    public void test1() {
        OneWayQueue queue = new OneWayQueue(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);//queue数组数据为[1,2,3]
        System.out.println(queue.peekFront()); //1
        queue.remove();//queue数组数据为[null,2,3]
        System.out.println(queue.peekFront()); //2
        queue.insert(4);//queArray数组数据为[4,2,3]
        System.out.println(queue.peekFront());//2
        queue.insert(5);//队列已满,queArray数组数据为[4,2,3]
    }
}
