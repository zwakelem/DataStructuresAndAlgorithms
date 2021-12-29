package za.co.simplitate.sortalgorithms;

import static za.co.simplitate.util.SortUtil.*;

public class CountingSort {

    public static void main(String[] args) {

        /*
            * only useful in specific circumstances
            * use when the range of values is not too large
            * also the dataset should not be too large
            * the range should not be significantly greater than the items you want to sort
            * in our example, the range is 1 to 10, and we want to sort 10 items
         */

        int[] intArray = COUNT_SORT_ARRAY;
        countingSort(intArray, 1, 10);
        printArray(intArray);

    }

    static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for(int i = 0; i < input.length; i++)
            countArray[input[i] - min]++;

        int j = 0;
        for(int i = min; i <= max; i++) {
            while(countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }

}
