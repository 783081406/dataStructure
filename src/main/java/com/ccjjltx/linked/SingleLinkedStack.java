package com.ccjjltx.linked;

/**
 * 单链表—栈
 *
 * @author ccj
 * @version 1.0
 * @since 1.8
 */
public class SingleLinkedStack {
    private SingleLinkedList link;

    public SingleLinkedStack() {
        link = new SingleLinkedList();
    }

    //添加元素
    public void push(Object obj) {
        link.addHead(obj);
    }

    //移除栈顶元素
    public Object pop() {
        Object obj = link.deleteHead();
        return obj;
    }

    //判断是否为空
    public boolean isEmpty() {
        return link.isEmpty();
    }

    //打印栈内元素信息
    public void display() {
        link.display();
    }
}
