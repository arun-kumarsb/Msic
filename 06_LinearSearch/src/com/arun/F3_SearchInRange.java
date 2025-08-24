package com.arun;

public class F3_SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28 };

        // search for 3 in the range of index [1,4]
        int target = 3;
        System.out.println(SearchInRange(1, 4, arr, target));
    }

    public static int SearchInRange(int start, int end, int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        if (start < 0) {
            start = 0;
        }
        if (end > arr.length) {
            end = arr.length - 1;
        }
        for (int i = start; i <= end; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
