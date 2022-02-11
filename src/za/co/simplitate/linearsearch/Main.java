package za.co.simplitate.linearsearch;

import static za.co.simplitate.util.SortUtil.*;

public class Main {

    public static void main(String[] args) {
        int[] intArray = INT_ARRAY;

        System.out.println(linearSearch(intArray, -15));
        System.out.println(linearSearch(intArray, 8));
    }

    public static int linearSearch(int[] input, int value) {
        for(int i = 0; i < input.length; i++) {
            if(input[i] == value)
                return i;
        }
        return -1;
    }
}
