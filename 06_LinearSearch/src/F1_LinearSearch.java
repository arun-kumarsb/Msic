
import java.util.Arrays;
import java.util.Scanner;

public class F1_LinearSearch {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {18, 12, 9, 14, 77, 50};
        int target = in.nextInt();
        // wheather 14 exist or not
        System.out.println("Does " + target + " Exist in " + Arrays.toString(arr) + ": " + DoesExist(target, arr));
        System.out.println();

        if (LinearSearch(arr, target) == -1) {
            System.out.println("Array Is Empty");
        } else if (LinearSearch(arr, target) == -2) {
            System.out.println("Element not found");
        } else if (LinearSearch(arr, target) != -1 && LinearSearch(arr, target) != -2) {
            System.out.println("Element found at index: " + LinearSearch(arr, target));
        }
        in.close();
    }

    // Time Complexity : how time grows as input grows
    /*
     * best: o(1) // constant // element found at very 1st index // how many checks: 1
     * worst: o(n) // linear // element not found even after going through all elem //how many checks: all
     */
    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -2;
    }

    static boolean DoesExist(int target, int[] arr) {
        boolean temp = false;
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                temp = true;
            }
        }
        return temp;
    }
}
