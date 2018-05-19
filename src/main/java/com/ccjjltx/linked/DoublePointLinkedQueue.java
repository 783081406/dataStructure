package com.ccjjltx.linked;

/**
 * 双端链表—队列
 * @author ccj
 * @version 1.0
 * @since 1.8
 */
public class DoublePointLinkedQueue {
    private DoublePointLinkedList dp;

    public DoublePointLinkedQueue(){
        dp = new DoublePointLinkedList();
    }
    public void insert(Object data){
        dp.addTail(data);
    }

    public void delete(){
        dp.deleteHead();
    }

    public boolean isEmpty(){
        return dp.isEmpty();
    }

    public int getSize(){
        return dp.getSize();
    }

    public void display(){
        dp.display();
    }
}
