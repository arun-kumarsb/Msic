
import java.util.Scanner;

public class Q1Ceiling {
    public static void main(String[] args) {
        // when do we apply binary search??
        // 1. sorted array
        // 2.
        Scanner in = new Scanner(System.in);
        // ceiling of a number
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = in.nextInt();
        // ceiling is the smallest number greater or equal to the target element
        // if target is 14, then ceiling is 14;
        // if target is 15, then ceiling is 16;
        // if target is  4, then ceiling is  5;
        // if target is  9, then ceiling is  9;
        System.out.println(Ceiling(arr, target));
        System.out.println(Floor(arr, target));
        in.close();
    }
    // edege cases
    // if the target is greater that the last element or greatest element


    static int Ceiling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[start];
    }

    static int Floor(int[] arr, int target){
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
