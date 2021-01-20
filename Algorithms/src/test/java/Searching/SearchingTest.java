package Searching;

import org.junit.Test;

public class SearchingTest {

    @Test
    public void linearSearch() {
        int[] array = {1,2,3,4,5,6,7,8,9,24,25,30,40};
        int search = LinearSearch.search( 24, array );
        System.out.println(search);
    }

    @Test
    public void binarySearch() {
        int[] array = {1,2,3,4,5,6,7,8,9,24,25,30,40};
        int search = BinarySearch.search( 24, array );
        System.out.println(search);
    }

}
