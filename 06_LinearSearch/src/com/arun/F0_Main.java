package com.arun;

public class F0_Main {
    public static void main(String[] args) {
        // find where 14 exist in array or not

        // ArrayList<Integer> list = new ArrayList<>();

        int[] arr = { 18, 12, 9, 14, 77, 50 };
        Find(14, arr);
        System.out.println(isExist(14, arr));

    }

    public static void Find(int i, int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            if (i == arr[j]) {
                System.out.println("Found at index: " + j);
            }
        }

    }

    public static Boolean isExist(int target, int[] arr) {
        // for unsorted array
        // Time Complexity -- how time grows as input grows
        /*
         * best O(1) // constant time comp // size of arraydoes not matter
         * worst O(N) // --linear time comp // N-size of array // worst case is we dont
         * find the item after ititerating through
         */
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                temp = 1;
            }
        }
        if (temp != 0) {
            return true;
        } else
            return false;
    }
}
