package Sorting;

/**
 * Сортировка вставками (рус)
 * Time complexity O(n^2).
 */
public class InsertionSort {

    public static int[] sort (int[] inputArray) {
        int[] tempArray = inputArray;
        for (int i = 1; i < tempArray.length; i++) {
            int current = tempArray[i];
            int j = i - 1;
            while(j >= 0 && current < tempArray[j]) {
                tempArray[j+1] = tempArray[j];
                j--;
            }
            tempArray[j+1] = current;
        }
        return tempArray;
    }

}
