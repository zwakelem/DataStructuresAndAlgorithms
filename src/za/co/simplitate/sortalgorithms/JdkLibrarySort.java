package za.co.simplitate.sortalgorithms;

import java.util.Arrays;

import static za.co.simplitate.util.SortUtil.INT_ARRAY;
import static za.co.simplitate.util.SortUtil.printArray;

public class JdkLibrarySort {

    public static void main(String[] args) {

        int[] intArray = INT_ARRAY; // {20, 35, -15, 7, 55, 1, -22}
        Arrays.parallelSort(intArray);
        printArray(intArray);

    }
}
