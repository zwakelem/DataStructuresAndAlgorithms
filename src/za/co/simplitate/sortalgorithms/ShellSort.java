package za.co.simplitate.sortalgorithms;

import static za.co.simplitate.util.SortUtil.*;

public class ShellSort {

    public static void main(String[] args) {

        int[] intArray = INT_ARRAY;
        printArray(intArray);
        printSeparators();

        for(int gap =  intArray.length / 2; gap > 0; gap /= 2 ) {

            for(int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j = i;

                while(j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }
        }

        printArray(intArray);
    }
}
