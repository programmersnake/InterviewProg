package Sorting;

/**
 * Time complexity is O(n log(n))
 */
public class QuickSort {
    /**
     *
     * @param inputArray
     * @param begin -> 0
     * @param end -> lenght of Array
     */
    public static void sort(int[] inputArray, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(inputArray, begin, end);
        sort(inputArray, begin, pivot-1);
        sort(inputArray, pivot+1, end);
    }

    private static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

}
