import java.util.Arrays;

public class Q1_SwapElement {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,2}; 
        System.out.println(Arrays.toString(arr));
        SwapElement(arr, 1, 4);
        System.out.println(Arrays.toString(arr));
    }

    static void SwapElement(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
