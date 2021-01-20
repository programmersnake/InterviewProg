package Sorting;

/**
 * Сортировка слиянием (рус)
 * Time complexity is O(n log(n))
 */
public class MergeSort {

    public static int[] sort(int[] inputArray, int left, int right) {
        if (right <= left)
            return inputArray;
        int middleValue = (left + right)/2;
        sort( inputArray, left, middleValue );
        sort( inputArray, middleValue +1, right);
        merge( inputArray, left, middleValue, right);

        return inputArray;
    }

    static void merge(int[] array, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        int leftArray[] = new int [lengthLeft];
        int rightArray[] = new int [lengthRight];

        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid+i+1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {

            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }

            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }

            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
