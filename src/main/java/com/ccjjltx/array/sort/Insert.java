package com.ccjjltx.array.sort;

import com.ccjjltx.utils.Shows;

/**
 * 插入排序
 * 直接插入排序基本思想是每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
 * 插入排序还分为直接插入排序、二分插入排序、链表插入排序、希尔排序等等
 *
 * @author ccj Date:2018-05-16 21:33
 * @version 1.0
 * @since 1.8
 */
public class Insert {

    private Insert() {
    }

    public static int[] sort(int[] array) {
        int j = 0;
        //从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            j = i;
            while (j > 0 && temp < array[j - 1]) {//从已经排序的序列最右边的开始比较，找到比其小的数
                array[j] = array[j - 1];//向后挪动
                j--;
            }
            array[j] = temp;//存在比其小的数，插入
            System.out.print("第" + i + "轮排序后的结果为:");
            Shows.showArray(array);
        }
        return array;
    }
}
