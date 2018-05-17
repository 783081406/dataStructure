package com.ccjjltx.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 栈
 *
 * @author ccj
 * @version 1.0
 * @since 1.8
 */
public class ArrayStack {
    //存储
    private Object[] stack;
    //指向栈顶的指针
    private int top;
    //容量
    private int size;

    //构造容器
    public ArrayStack() {
        size = 10;
        stack = new Object[size];
        top = -1;
    }

    //自定义构造器
    public ArrayStack(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("栈初始容量不能小于0: " + size);
        }
        this.size = size;
        stack = new Object[size];
        top = -1;
    }

    /**
     * 压入元素
     *
     * @param item 需要压入的元素
     * @return 压入的元素
     */
    public Object push(Object item) {
        //验证是否需要扩容
        isGrow();
        stack[++top] = item;
        return item;
    }

    /**
     * 出栈
     *
     * @return 返回删除的元素
     */
    public Object pop() {
        Object object = stack[top];
        //删除
        remove();
        return object;
    }

    /**
     * 获取栈顶元素
     *
     * @return 栈顶元素
     */
    public Object peek() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    /**
     * 判断是否为空
     *
     * @return 布尔值
     */
    public boolean isEmpty() {
        return (top == -1);
    }

    /**
     * 删除栈顶元素
     */
    private void remove() {
        stack[top] = null;
        top--;
    }

    /**
     * 扩容
     *
     * @return 布尔
     */
    private boolean isGrow() {
        //当前top指向最高size,需要拓容
        if (top == size - 1) {
            this.size = size * 2;//大小拓2倍
            stack = Arrays.copyOf(stack, size);
            return true;
        } else {
            return false;
        }
    }
}
