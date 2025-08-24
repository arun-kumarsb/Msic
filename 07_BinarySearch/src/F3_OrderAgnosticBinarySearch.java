public class F3_OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // if we dont know that array is sorted in ascending or descending order
        int[] arr = { 90, 75, 36, 18, 12, 6, 4, 3, 1 };
        int target = 36;
        System.out.println(OrderAgnosticBinarySearch(target, arr));
    }

    public static int OrderAgnosticBinarySearch(int target, int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        boolean isAsc = nums[start] < nums[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target > nums[mid]) {
                    start = mid + 1;
                } else if (target < nums[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target < nums[mid]) {
                    start = mid + 1;
                } else if (target > nums[mid]) {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
