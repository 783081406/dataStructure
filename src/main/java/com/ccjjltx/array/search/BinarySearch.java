package com.ccjjltx.array.search;

/**
 * 二分法查找
 *
 * @author ccj Date:2018-05-16 22:00
 * @version 1.0
 * @since 1.8
 */
public class BinarySearch {
    private BinarySearch() {
    }

    /**
     * 循环二分法查找
     *
     * @param array 排完序的数组
     * @param data  要找的数据
     * @return 位置
     */
    public static int search(int[] array, int data) {
        int start = 0;
        int end = array.length - 1;
        int mid = -1;
        int i = 1;
        while (start <= end) {
            System.out.println("查找第" + i + "次!");
            mid = (start + end) / 2;
            if (array[mid] == data) {
                return mid;
            } else if (array[mid] > data) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            i++;
        }
        return -1;
    }

    public static int search(int[] array, int data, int start, int end) {
        int mid = -1;
        System.out.println("查找");
        if (start > end) {
            return mid;
        }
        mid = (start + end) / 2;
        if (array[mid] < data) {
            return search(array, data, mid + 1, end);
        } else if (array[mid] > data) {
            return search(array, data, start, mid - 1);
        } else {
            return mid;
        }
    }
}
