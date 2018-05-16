package com.ccjjltx.utils;

/**
 * 工具类：数据打印
 *
 * @author ccj Date:2018-05-16 20:53
 * @version 1.0
 * @since 1.8
 */
public class Shows {
    private Shows() {
    }

    public static void showArray(int[] array) {
        if (array == null) {
            return;
        }
        for (int a : array) {
            System.out.print(a + "  ");
        }
        System.out.println();
    }
}
