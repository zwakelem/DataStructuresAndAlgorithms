package za.co.simplitate.sortalgorithms;

import static za.co.simplitate.util.SortUtil.*;

public class InsertionSort {

    /*
     * expands the sorted partition, assumes 1st element in array is sorted
     * takes 1st element in unsorted partition and inserts it in sorted partition
     * increases the sorted partition from left to right
     */

    public static void main(String[] args) {
        int[] intArray = INT_ARRAY;

//        iterativeImplementation(intArray);
        recursiveInsertionSort(intArray, intArray.length);

        printArray(intArray);
    }

    static void recursiveInsertionSort(int[] input, int numItems) {
        // { 20, 35, -15, 7, 55, 1, -22 }
        if(numItems < 2)
            return;

        recursiveInsertionSort(input, numItems - 1);

        int newElement = input[numItems - 1];
        int i;

        for(i = numItems - 1; i > 0 && input[i - 1] >= newElement; i--)
            input[i] = input[i -1];

        input[i] = newElement;

    }

    private static void iterativeImplementation(int[] intArray) {
        // { 20, 35, -15, 7, 55, 1, -22 }
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;

            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] >= newElement; i--)
                intArray[i] = intArray[i -1];

            intArray[i] = newElement;
        }
    }
}
