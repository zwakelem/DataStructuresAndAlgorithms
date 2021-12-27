package za.co.simplitate.recursion;

import static za.co.simplitate.util.SortUtil.INT_ARRAY;
import static za.co.simplitate.util.SortUtil.printArray;

public class QuickSort {

    public static void main(String[] args) {

        int[] intArray = INT_ARRAY; // {20, 35, -15, 7, 55, 1, -22}
        quickSort(intArray, 0, intArray.length);
        printArray(intArray);
    }

    static void quickSort(int[] input, int start, int end) {
        if(end - start < 2) // 1 element array
            return;

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    // {20, 35, -15, 7, 55, 1, -22}
    static int partition(int[] input, int start, int end) {
        // this is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i < j) {

            while(i < j  && input[--j] >= pivot); // empty loop
            if(i < j)
                input[i] = input[j];

            while(i < j && input[++i] <= pivot); // empty loop
            if(i < j)
                input[j] = input[i];
        }
        input[j] = pivot;
        return j;
    }
}
