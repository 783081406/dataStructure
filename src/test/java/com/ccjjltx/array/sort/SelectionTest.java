package com.ccjjltx.array.sort;

import com.ccjjltx.utils.Shows;
import org.junit.Test;

public class SelectionTest {

    @Test
    public void test1() {
        int[] array = {4, 2, 8, 9, 5, 7, 6, 1, 3};
        //未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        Shows.showArray(array);
        System.out.println("-----------------------");
        array = Selection.sort(array);
        System.out.println("经过冒泡排序后的数组顺序为：");
        Shows.showArray(array);
    }
}
