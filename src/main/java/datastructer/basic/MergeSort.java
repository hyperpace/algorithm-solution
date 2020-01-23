package datastructer.basic;

public class MergeSort {
    private int[] array;

    public MergeSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        mergeSort(0, array.length - 1);
    }

    public void mergeSort(int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(low, middle);
            mergeSort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    public void merge(int low, int middle, int high) {
        int[] helper = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high) {
            if (array[helperLeft] <= array[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remainCount = middle - helperLeft;
        for (int i = 0; i <= remainCount; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }
}
