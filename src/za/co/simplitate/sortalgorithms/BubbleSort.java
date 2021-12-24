package za.co.simplitate.sortalgorithms;

import static za.co.simplitate.util.SortUtil.*;

public class BubbleSort {

    public static void main(String[] args) {

        int[] intArray = INT_ARRAY;

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i=0; i < lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[i+1])
                    swap(intArray, i, i+1);
            }
        }

        printArray(intArray);
    }


}
