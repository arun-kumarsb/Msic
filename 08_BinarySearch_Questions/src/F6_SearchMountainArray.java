public class F6_SearchMountainArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 3, 1 };
        int target = 3;
        System.out.println(search(nums, target));
        // Hard level Ques
        // we have to retun the smalest index of target in the mountain array
        // [1,2,3,4,5,3,1] -- target // 3
        // find peak element // index no 4
        // search in aseciding array simple
        // if not found binary search in decrecing array
    }

    static int search(int[] arr, int target) {

        int peak = peakIndexMounatinArray(arr);
        int firstTry = OrderAgnosticBinarySearch(target, arr, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return OrderAgnosticBinarySearch(target, arr, peak, arr.length - 1);

    }

    public static int OrderAgnosticBinarySearch(int target, int[] nums, int start, int end) {

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

    public static int peakIndexMounatinArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
