public class F3OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = { 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(OrderAgnosticBS(arr, 2));

        int[] nums = new int[] { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
        int target = 36;
        System.out.println(OrderAgnosticBS(nums, target));
    }

    static int OrderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        Boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
