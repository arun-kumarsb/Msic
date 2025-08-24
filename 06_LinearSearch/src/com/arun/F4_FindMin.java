package com.arun;

public class F4_FindMin {
    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28 };
        System.out.println(Min(arr));
        System.out.println(Max(arr));
    }

    static int Min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
        
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
        
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
