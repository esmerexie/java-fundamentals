package sorting;

import org.junit.jupiter.api.Test;
import sort.QuickSort;
import sort.SelectionSort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SortingTest {

        int [] sut1 = {8,4,23,42,16,15};
        int [] sut2 = {20,18,12,8,5,-2};

        @Test
        void insertSortTest(){

            assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(SelectionSort.selctionSort(sut1)));
            assertEquals("[-2, 5, 8, 12, 18, 20]", Arrays.toString(SelectionSort.selctionSort(sut2)));

        }

        @Test
        void quickSortTest(){
        int [] test1 = {8,4,23,42,16,15};
            QuickSort.sort(test1);
            assertArrayEquals(new int[]{4, 8, 15, 16, 23, 42}, test1);
        }



}
