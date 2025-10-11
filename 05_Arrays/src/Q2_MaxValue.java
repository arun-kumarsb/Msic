
import java.util.Arrays;

// import java.util.Arrays;

public class Q2_MaxValue {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 4, 55, 22, 1 };
        System.out.println(MaxValue(arr));
    }

    public static int MaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int MaxValueInRange(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
