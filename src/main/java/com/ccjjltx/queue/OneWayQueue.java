package com.ccjjltx.queue;

import sun.invoke.empty.Empty;

/**
 * 队列
 * 1.与栈不同的是，队列中的数据不总是从数组的0下标开始的，移除一些队头front的数据后，队头指针会指向一个较高的下标位置
 * 2.再设计时，队列中新增一个数据时，队尾的指针rear 会向上移动，也就是向下标大的方向。移除数据项时，队头指针 front 也会向下移动.
 * 那么这样设计好像和现实情况相反，比如排队买电影票，队头的买完票就离开了，然后队伍整体向前移动。在计算机中也可以在队列中删除一个数之后，
 * 队列整体向前移动，但是这样做效率很差。我们选择的做法是移动队头和队尾的指针
 * 3.如果向第2步这样移动指针，相信队尾指针很快就移动到数据的最末端了，这时候可能移除过数据，那么队头会有空着的位置，然后新来了一个数据项.
 * 为了避免队列不满却不能插入新的数据，我们可以让队尾指针绕回到数组开始的位置，这也称为“循环队列”
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
