import java.lang.reflect.Array;
import java.util.Arrays;

public class Q4FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int[] ans = FirstAndLast(arr, 7);
        System.out.println(Arrays.toString(ans));
        
    }
    static int[] FirstAndLast(int arr[], int target){
        int start = position(arr, target, true);
        int end = position(arr, target, false);
        return new int[] {start, end};
    }
    static int position(int[] arr, int target, boolean leftsideTrue){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                ans = mid;
                if (leftsideTrue) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    
}
