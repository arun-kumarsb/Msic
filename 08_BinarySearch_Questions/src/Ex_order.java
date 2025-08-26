public class Ex_order {
    public static void main(String[] args) {
        // when we dont knw the nature of the array
        int[] arr = { 1, 2, 3, 45, 66 };
        int[] nums = { 66, 45, 33, 4, 3, 2, 1 };
        int target = 3;
        System.out.println(OrderAgnostic(target, nums));

    }

    static int OrderAgnostic(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[start]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
