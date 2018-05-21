package com.ccjjltx.seniorsort;

import org.junit.Test;

/**
 * @author ccj
 * @version 1.0
 * @since 1.8
 */
public class HillSortTest {
    @Test
    public void test1() {
        int[] array = {4, 2, 8, 9, 5, 7, 6, 1, 3, 10};
        HillSort.shellKnuthSort(array);
    }

    @Test
    public void test2() {
        int[] array = {4, 2, 8, 9, 5, 7, 6, 1, 3, 10};
        HillSort.shellSort(array);
    }
}
