public class Q8SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = { 13, 17, 1, 2, 3, 4, 5};
        int target = 3;
        System.out.println(pivot(arr));
        // System.out.println(SearchInRotatedArray(arr, target));

    }

    static int SearchInRotatedArray(int[] arr, int target) {
        int pivot = pivot(arr);
        if(pivot == -1){
            BinarySearch(target, arr, 0, arr.length - 1);
        }
        else if (arr[pivot] == target) {
            return pivot;
        }
        else if (target >= arr[0]) {
            return BinarySearch(target, arr, 0, pivot-1);
        }
        return BinarySearch(target, arr, pivot + 1, arr.length - 1);
    }

    static int BinarySearch(int target, int[] nums, int start, int end) {
        while (start <= end) {
            // int mid = (start+end)/2;
            // has a problem
            // if start and end are too large then there is a point when start + end exeed
            // the range of integer
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            }
            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            // case 1: arr[mid] < arr[mid+1] // ans mid + 1
            // case 2: arr[mid] < arr[mid-1] // ans = mid - 1
            // case 3: arr[start] > arr[mid ]
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else if (arr[mid] > arr[start]){
                start = mid + 1;
            }
        }
        return -1;

    }
}
