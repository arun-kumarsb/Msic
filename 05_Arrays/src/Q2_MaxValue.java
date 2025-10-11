
import java.util.Arrays;

// import java.util.Arrays;

public class Q2_MaxValue {
    public static void main(String[] args) {
        
        int[] nums = { 0, 1, 34, 0, 5 };
        System.out.println(Arrays.toString(nums));
        System.out.println("Maximum Value of Array is: " + Max(nums));
    }

    public static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}
