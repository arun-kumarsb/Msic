

import java.util.Arrays;

public class Q1_Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,10};
        System.out.println("Array Before Swaping: " + Arrays.toString(arr));

        Swap(arr, 1,3);
        System.out.println("Array After Swaping: " + Arrays.toString(arr));
    }

    private static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
