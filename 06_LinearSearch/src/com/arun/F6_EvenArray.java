package com.arun;

public class F6_EvenArray {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int rem = 0;
            int temp = arr[i];
            while (temp != 0) {
                temp = temp / 10;
                rem++;
            }
            if (rem % 2 == 0) {
                System.out.println(arr[i] + " contains " + rem + " digits " + "(even number of digits)");
                count++;
            } else {
                System.out.println(arr[i] + " contains " + rem + " digits " + "(odd number of digits)");

            }
        }
        return count;
    }

}
