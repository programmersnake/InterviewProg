package Searching;

/**
 * Time complexity is O(n)
 */
public class LinearSearch {

    public static int search(int searchValue, int[] inputArray) {
        int index = 0;
        for (int i : inputArray) {
            if(i==searchValue)
                return index;
            index++;
        }
        return -1;
    }

}
