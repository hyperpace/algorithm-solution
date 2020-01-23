package datastructer.basic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MergeSortTest {

    @Test
    void sorted_array_success() {
        int[] array = {3, 5, 1, 9, 7, 10, 3};

        MergeSort mergeSort = new MergeSort(array);
        mergeSort.sort();
        System.out.println(Arrays.toString(array));
    }
}