package Sorting;

/**
 * Time complexity O(n^2).
 */
public class BubbleSort {

    public static int[] sort(int[] inputArray) {
        int[] tempArray = inputArray;
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < tempArray.length - 1; i++) {
                if (tempArray[i] > tempArray[i+1]) {
                    int tempValue = tempArray[i];
                    tempArray[i] = tempArray[i+1];
                    tempArray[i+1] = tempValue;
                    isSorted = false;
                }
            }
        }

        return inputArray;
    }

}
