package za.co.simplitate.sortalgorithms;

import static za.co.simplitate.util.SortUtil.*;

public class SelectionSort {

    public static void main(String[] args) {

        int[] intArray = INT_ARRAY;

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- ) {

            int largest = 0;

            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest])
                    largest = i;
            }
            swap(intArray, largest, lastUnsortedIndex);
        }
        printArray(intArray);
    }

}
