package za.co.simplitate.util;

public class SortUtil {

    public static final int[] INT_ARRAY = {20, 35, -15, 7, 55, 1, -22};

    public static void printArray(int[] array) {
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
