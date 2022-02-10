package za.co.simplitate.sortalgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static za.co.simplitate.util.SortUtil.*;

public class BucketSort {

    public static void main(String[] args) {
        int[] intArray = BUCKET_SORT_ARRAY;

        bucketSort(intArray);

        printArray(intArray);
    }

    private static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];

        // creating buckets
        for(int i = 0; i < buckets.length; i++) {
//            buckets[i] = new ArrayList<>();
            buckets[i] = new LinkedList<>();
        }

        // scatter values into buckets
        for(int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        // sort each bucket
        for(List bucket: buckets) {
            Collections.sort(bucket);
        }

        // write back to array
        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for(int value: buckets[i]) {
                input[j++] = value;
            }
        }
    }

    private static int hash(int value) {
        return value / (int) 10;
    }
}
