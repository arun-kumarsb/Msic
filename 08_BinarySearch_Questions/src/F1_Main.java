public class F1_Main {
    public static void main(String[] args) {
        // Question: arr = [2,3,5,9,14,16,18]; target = 15;
        // ceiling of a no. = ? find the smallest no. in the array that is that is\
        // greater than or equal to target element
        // explaination
        // ceiling(arr, 14) = 14;
        // ceiling(arr, 15) = 16;
        // ceiling(arr, 04) = 05;
        // ceiling(arr, 09) = 09;
        // 0, 1, 2, 3, 04, 05, 06

        /*
         * until the while condition start is less than or equal to
         * end hence when the conditin fails i.e start > end we are at this
         * S M E
         * E M S
         * for ceiling we have to retun arr[start] and for floor we have to retun
         * arr[end]
         */

        /*
         * floor is the gratest no that is smaller or equal to target no.
         */
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        System.out.println(Ceiling(target, arr));
        System.out.println(floor(target, arr));

    }

    public static int Ceiling(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (target > arr[arr.length - 1]) {
                return -1;
            }
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }

    public static int floor(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (target < arr[arr.length - 1]) {
                return -1;
            }
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
