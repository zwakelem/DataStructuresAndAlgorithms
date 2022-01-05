package za.co.simplitate.recursion;

import static za.co.simplitate.util.SortUtil.*;

public class MergeSort {

    public static void main(String[] args) {

        int[] intArray = INT_ARRAY; // {20, 35, -15, 7, 55, 1, -22}
        mergeSort(intArray, 0, intArray.length);
        printArray(intArray);

    }

    public static void mergeSort(int[] input, int start, int end) {
        // {20, 35, -15, 7, 55, 1, -22}
        if(end - start < 2) // this is a 1 element array
            return;

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        mergeDesc(input, start, mid, end);
    }

    public static void mergeDesc(int[] input, int start, int mid, int end) {
        // {20, 35, -15, 7, 55, 1, -22}
        // are all the elements in the left array less than elements in the right array
        if(input[mid - 1] >= input[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[end - start];
        while(i < mid && j < end)
            tempArray[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(tempArray, 0, input, start, tempIndex);
    }

    public static void mergeAsc(int[] input, int start, int mid, int end) {
        // {20, 35, -15, 7, 55, 1, -22}
        // are all the elements in the left array less than elements in the right array
        if(input[mid - 1] <= input[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[end - start];
        while(i < mid && j < end)
            tempArray[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(tempArray, 0, input, start, tempIndex);
    }


}
