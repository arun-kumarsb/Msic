
import java.util.Scanner;

public class Q2Floor {
    public static void main(String[] args) {
        // when do we apply binary search??
        // 1. sorted array
        // 2.
        Scanner in = new Scanner(System.in);
        // ceiling of a number
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = in.nextInt();
        System.out.println(Floor(arr, target));
        in.close();
    }
    // edge case
    

    static int Floor(int[] arr, int target){
        // if (target < arr[0]) {
        //     return -1;
        // }
        int start = 0;
        int end  = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}
