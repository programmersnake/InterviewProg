package Searching;

public class BinarySearch {
    /**
     *
     * @param searchValue you need search this value
     * @param inputArray search in this Sorted array
     * @return searchID
     */
    public static int search(int searchValue, int[] inputArray) {
        int startIndex = 0;
        int finalIndex = inputArray.length - 1;

        while(startIndex <= finalIndex) {
            int middleIndex = (startIndex + finalIndex) / 2;
            System.out.println(middleIndex);
            if (inputArray[middleIndex] == searchValue) {
                return middleIndex;
            }
            else if (inputArray[middleIndex] < searchValue) {
                startIndex = middleIndex + 1;
            }
            else if (inputArray[middleIndex] > searchValue) {
                finalIndex = middleIndex - 1;
            }
        }
        return -1;
    }

}
