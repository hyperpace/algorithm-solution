package datastructer.basic;

public class QuickSort {
    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        quickSort(0, array.length - 1);
    }

    public void quickSort(int left, int right) {

        if (left < right) {
            int index = partition(left, right);
            if (left < index - 1) {
                quickSort(left, index - 1);
            }
            if (index < right) {
                quickSort(index, right);
            }
        }
    }

    public int partition(int left, int right) {
        int pivot = array[(left + right) / 2];

        while (left <= right) {
            while (array[left] < pivot) left++;
            while (array[right] > pivot) right--;

            if (left <= right) {
                swap(left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    public void swap(int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
