package Sorting;

/**
 * Select minimum value and Add on the left side. This algorithm, until end the array.
 * Time complexity is O(n^2)
 */
public class SelectionSort {

    public static int[] sort(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            int min = inputArray[i];
            int minId = i;
            for (int j = i + 1; j < inputArray.length; j++) {
                if ( inputArray[j] < min ) {
                    min = inputArray[j];
                    minId = j;
                }
            }

            int temp = inputArray[i];
            inputArray[i] = min;
            inputArray[minId] = temp;
        }

        return inputArray;
    }

}
