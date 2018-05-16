package com.ccjjltx.array.search;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void test1() {
        int[] arrray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 23, 45, 67, 89, 90};
        System.out.println("数据位置:" + BinarySearch.search(arrray, 1));
        System.out.println("数据位置:" + BinarySearch.search(arrray, 2));
    }

    @Test
    public void test2() {
        int[] arrray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 23, 45, 67, 89, 90};
        System.out.println("数据位置:" + BinarySearch.search(arrray, 1, 0, 14));
        System.out.println("数据位置:" + BinarySearch.search(arrray, 1, 0, 6));
        System.out.println("数据位置:" + BinarySearch.search(arrray, 2, 0, 14));
        System.out.println("数据位置:" + BinarySearch.search(arrray, 2, 0, 8));
    }
}
