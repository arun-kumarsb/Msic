package com.Arun;

import java.util.Arrays;

public class Q3_ReversingArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6}; // {6,5,4,3,2,1}
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Reversed Array: " + Reverse(arr));
    }

    public static String Reverse(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return Arrays.toString(arr);
    }
}
