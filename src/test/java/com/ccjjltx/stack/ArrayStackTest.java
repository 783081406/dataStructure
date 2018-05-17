package com.ccjjltx.stack;

import org.junit.Test;

public class ArrayStackTest {
    @Test
    public void test1() {
        ArrayStack stack = new ArrayStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push("abc");
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
    }

    /**
     * 利用栈反转reverse
     */
    @Test
    public void test2() {
        ArrayStack arrayStack = new ArrayStack(7);
        String string = "abcdefg";
        char[] chars = string.toCharArray();
        for (char c : chars) {
            arrayStack.push(c);
        }
        while (!arrayStack.isEmpty()) {
            System.out.print(arrayStack.pop());
        }
    }

    /**
     * 测试是否会自动扩容
     */
    @Test
    public void test3() {
        ArrayStack arrayStack = new ArrayStack();
        for (int i = 0; i < 15; i++) {
            arrayStack.push(i);
        }
        while (!arrayStack.isEmpty()) {
            System.out.print(arrayStack.pop()+" ");
        }
    }
}
