package com.ccjjltx.array.sort;

import com.ccjjltx.utils.Shows;

/**
 * 冒泡排序
 * 1.比较相邻的元素。如果第一个比第二个大，就交换他们两个
 * 2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数（也就是第一波冒泡完成）
 * 3.针对所有的元素重复以上的步骤，除了最后一个
 * 4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
 *
 * @author ccj Date:2018-05-16 20:49
 * @version 1.0
 * @since 1.8
 */
public class Bubble {
    private Bubble() {
    }

    /**
     * 冒泡排序
     *
     * @param array 未排序
     * @return 排序好的数组
     */
    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            //设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
            //结果输出
            System.out.print("第" + i + "轮排序后的结果为:");
            Shows.showArray(array);
        }
        return array;
    }
}
