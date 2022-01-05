package za.co.simplitate.sortalgorithms;

import static za.co.simplitate.util.SortUtil.*;


public class RadixSort {

    /*
     * all values have to have the same radix and same width
     *  radix, for numbers, is 10 because all the possible values is 10
     *  i.e 0 to 9
     *
     * this implementation is a stable sort
     */

    public static void main(String[] args) {

        int[] intArray = RADIX_SORT_ARRAY;
        radixSort(intArray, 10, 4);
        printArray(intArray);

    }

    static void radixSort(int[] input, int radix, int width) {
        for(int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    static void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for(int value: input)
            countArray[getDigit(position, value, radix)]++;

        // Adjust the count array
        for(int j = 1; j < radix; j++)
            countArray[j] += countArray[j - 1];

        int[] temp = new int[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--)
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];

        for(int tempIndex = 0; tempIndex < numItems; tempIndex++)
            input[tempIndex] = temp[tempIndex];

    }

    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }

}
