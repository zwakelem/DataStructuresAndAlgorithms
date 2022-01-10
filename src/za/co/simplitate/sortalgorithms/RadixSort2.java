package za.co.simplitate.sortalgorithms;

import static za.co.simplitate.util.SortUtil.*;

public class RadixSort2 {

    public static void main(String[] args) {
        String[] stringsArray = STRINGS_ARRAY;

        radixSort(stringsArray, 26, stringsArray[0].length());

        printArray(stringsArray);
    }

    static void radixSort(String[] input, int radix, int width) {
        for(int i = width - 1; i >= 0; i--)
            radixSingleSort(input, i, radix);
    }

    static void radixSingleSort(String[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for(String value: input)
            countArray[getIndex(position, value)]++;

        // Adjust the count array
        for(int j = 1; j < radix; j++)
            countArray[j] += countArray[j - 1];

        String[] temp = new String[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--)
            temp[--countArray[getIndex(position, input[tempIndex])]] = input[tempIndex];

        for(int tempIndex = 0; tempIndex < numItems; tempIndex++)
            input[tempIndex] = temp[tempIndex];

    }

    static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }
}
