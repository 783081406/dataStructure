package com.ccjjltx.recursion;

import com.ccjjltx.utils.Shows;
import org.junit.Test;

public class MergingSortTest {
    @Test
    public void test1() {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10, 11};
        Shows.showArray(MergingSort.sort(a, b));
    }

    @Test
    public void test2() {
        int[] c = {2, 7, 8, 3, 1, 6, 9, 0, 5, 4};
        c = MergingSort.mergeSort(c, 0, c.length - 1);
        Shows.showArray(c);
    }
}
