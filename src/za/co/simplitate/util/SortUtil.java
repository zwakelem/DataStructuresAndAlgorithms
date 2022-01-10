package za.co.simplitate.util;

public class SortUtil {

    public static final int[] INT_ARRAY = { 20, 35, -15, 7, 55, 1, -22 };

    public static final int[] COUNT_SORT_ARRAY = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

    public static final int[] RADIX_SORT_ARRAY = {4725, 4586, 1330, 8792, 1594, 5729};

    public static final String[] STRINGS_ARRAY = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printArray(String[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if(i == j)
            return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printSeparators() {
        System.out.println("*************************************");
    }

    public static void printInt(int i) {
        System.out.println(i);
    }

    public static void printEmptyLine() {
        System.out.println();
    }

}
