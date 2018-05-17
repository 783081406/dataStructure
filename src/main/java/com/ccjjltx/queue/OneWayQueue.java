package com.ccjjltx.queue;

import sun.invoke.empty.Empty;

/**
 * 队列
 *
 * @author ccj
 * @version 1.0
 * @since 1.8
 */
public class OneWayQueue {
    private Object[] queue;
    private int size;
    private int front;//队头
    private int rear;//队尾
    private int nItems;//实际个数

    public OneWayQueue() {
        size = 10;
        queue = new Object[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public OneWayQueue(int size) {
        this.size = size;
        queue = new Object[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    /**
     * 队列中新增数据
     *
     * @param value
     */
    public void insert(int value) {
        if (isFull()) {
            System.out.println("队列已满!");
        } else {
            //如果队列尾指向顶，那么循环回来，执行队列的第一个元素
            if (rear == size - 1) {
                rear = -1;
            }
            //队尾指正加1，然后在队尾指针处插入新的数据
            queue[++rear] = value;
            nItems++;
        }
    }

    /**
     * 移除队头数据
     *
     * @return 被移除的队头数据
     */
    public Object remove() {
        Object temp = null;
        if (!isEmpte()) {
            temp = queue[front];
            queue[front] = null;
            front++;
            if (front == size) {//如果队头等于size,则到了数组的尾
                front = 0;
            }
            nItems--;
            return temp;
        }
        return temp;
    }

    /**
     * 查看队头数据
     *
     * @return 队头数据
     */
    public Object peekFront() {
        return queue[front];
    }

    /**
     * 判断队列是否为满
     *
     * @return 布尔
     */
    public boolean isFull() {
        return (nItems == size);
    }

    /**
     * 判断是否为空
     *
     * @return 布尔
     */
    public boolean isEmpte() {
        return (nItems == 0);
    }

    /**
     * 返回队列充填大小
     *
     * @return 大小值
     */
    public int getSize() {
        return nItems;
    }

}
