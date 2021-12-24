package za.co.simplitate.sortalgorithms;

import static za.co.simplitate.util.SortUtil.*;

public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = INT_ARRAY;

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;

            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] >= newElement; i--)
                intArray[i] = intArray[i -1];

            intArray[i] = newElement;
        }

        printArray(intArray);
    }
}