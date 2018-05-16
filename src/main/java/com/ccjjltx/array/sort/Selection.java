package com.ccjjltx.array.sort;

import com.ccjjltx.utils.Shows;

/**
 * 选择排序
 * 选择排序是每一次从待排序的数据元素中选出最小的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完
 * 1.从待排序序列中，找到关键字最小的元素
 * 2.如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换
 * 3.从余下的 N - 1 个元素中，找出关键字最小的元素，重复(1)、(2)步，直到排序结束
 *
 * @author ccj Date:2018-05-16 21:16
 * @version 1.0
 * @since 1.8
 */
public class Selection {
    private Selection() {

    }

    /**
     * 选择排序
     *
     * @param array 未排序
     * @return 排序好的数组
     */
    public static int[] sort(int[] array) {
        //总共要经过N-1轮比较
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            //第i轮排序的结果为
            System.out.print("第" + (i + 1) + "轮排序后的结果为:");
            Shows.showArray(array);
        }
        return array;
    }
}
