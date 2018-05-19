package com.ccjjltx.linked;

import org.junit.Test;

public class SingleLinkedStackTest {
    @Test
    public void test1() {
        SingleLinkedStack singleList = new SingleLinkedStack();
        singleList.push("A");
        singleList.push("B");
        singleList.push("C");
        singleList.push("D");
        //打印当前链表信息
        singleList.display();
        //出栈
        singleList.pop();
        singleList.display();
    }
}
