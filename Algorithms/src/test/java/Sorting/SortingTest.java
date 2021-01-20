package Sorting;

import org.junit.Test;

import java.util.Arrays;

public class SortingTest {

    @Test
    public void bubbleSort() {
        int[] array = {1,3,5,2,6,8,9,10,7,4,20,19,18,16,11,12,13,14};
        System.out.println( Arrays.toString(array));
        BubbleSort.sort( array );
        System.out.println( Arrays.toString(array));
    }

    @Test
    public void insertionSort() {
        int[] array = {1,3,5,2,6,8,9,10,7,4,20,19,18,16,11,12,13,14};
        System.out.println( Arrays.toString(array));
        InsertionSort.sort( array );
        System.out.println( Arrays.toString(array));
    }

    @Test
    public void selectionSort() {
        int[] array = {1,3,5,2,6,8,9,10,7,4,20,19,18,16,11,12,13,14};
        System.out.println( Arrays.toString(array));
        SelectionSort.sort( array );
        System.out.println( Arrays.toString(array));
    }

    @Test
    public void mergeSort() {
        int[] array = {1,3,5,2,6,8,9,10,7,4,20,19,18,16,11,12,13,14};
        System.out.println( Arrays.toString(array));
        MergeSort.sort( array, 0, array.length-1 );
        System.out.println( Arrays.toString(array));
    }

    @Test
    public void quickSort() {
        int[] array = {1,3,5,2,6,8,9,10,7,4,20,19,18,16,11,12,13,14};
        System.out.println( Arrays.toString(array));
        QuickSort.sort( array, 0, array.length-1 );
        System.out.println( Arrays.toString(array));
    }

}
