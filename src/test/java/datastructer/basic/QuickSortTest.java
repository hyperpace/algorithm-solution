package datastructer.basic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class QuickSortTest {

    @Test
    void array_sort_success() {
        int[] array = {3, 5, 1, 9, 7, 10, 3};

        QuickSort quickSort = new QuickSort(array);
        quickSort.sort();
        System.out.println(Arrays.toString(array));
    }
}