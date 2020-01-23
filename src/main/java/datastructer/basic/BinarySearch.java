package datastructer.basic;

public class BinarySearch {
    private int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    int binarySearch(int x) {
        int low = 0;
        int high = array.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] < x) {
                low = mid + 1;
            } else if (array[mid] > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    int binarySearchRecursive(int x, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (array[mid] < x) {
            return binarySearchRecursive(x, mid + 1, high);
        } else if (array[mid] > x) {
            return binarySearchRecursive(x, low, mid - 1);
        } else {
            return mid;
        }
    }
}
