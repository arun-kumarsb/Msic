public class F7_RotatedSortedArray {
    public static void main(String[] args) {
        int[] RNums = { 3, 4, 5, 6, 8, 10, 0, 1, 2 };
        System.out.println(findPivot(RNums));
        System.out.println(search(RNums, 1));
    }

    // rorted binary search // target // find indexin rorted array
    // what is rotated array
    // arr which is not rotated
    // arr = [2,4,5,7,8,9,10,12]
    // after 1 rotation --> [12,2,4,5,7,8,9,10] // rotated array
    // after 2 rotation --> [10,12,2,4,5,7,8,9] // rotated array
    // after 3 rotation --> [9,10,12,2,4,5,7,8] // rotated array
    /*
     * approch no 1 {
     * 1. find the pivot in the array // PIVOT--> from where next no are ascending
     * // [3,4,5,6,7,0,1,2] --> 7 is pivot
     * 2. search in 1st half from 0 to pivot otherwise
     * search in 2nd half from (pivot + 1) to end;
     * }
     *
     * how to find pivot
     * [3,4,5,6,7,0,1,2]
     * -s-----m-------e-
     * when arr[mid] > arr[mid+1] that is pivot
     * 
     * [3,4,5,6,7,0,1,2]
     * -s-----m---m---e-
     * when arr[mid] < arr[mid-1] that is pivot
     * 
     * start >= mid element
     * hence all element
     * [4 5 6 3 2 1 0]
     * -s-----m-----e-
     * all no after mid are samller than those befor mid
     * henec we can ingnore all these elements since we are findig peak // largest
     * end = mid - 1;
     * 
     * start < mid element
     * [3,4,5,6,2]
     * -s---m---e- 3 < 5
     * start = mid + 1;
     * if mid was pivot it must be caught in case 1 and 2 thus we can say it contain
     * bigger elements
     * 
     */
    /*
     * search in rotated array
     * 
     * pivot element == target elemet
     * 
     * target > start elemet // start till pivot - 1; end = pivot - 1;
     * all elemnt beofre pivot is smaller than start
     * 
     * otherwise search in next array target < start element all element are bigger
     * than target
     * pivot+1 till lenth -1;
     */

    public static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        if (pivot == -1) {
            // normal bianry search
            return OrderAgnosticBinarySearch(target, arr, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return OrderAgnosticBinarySearch(target, arr, 0, pivot - 1);
        } else {
            return OrderAgnosticBinarySearch(target, arr, pivot + 1, arr.length - 1);
        }
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // 4 cases over here
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else if (arr[mid] > arr[start]) {
                start = mid + 1;
            }
        }
        return -1;
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
}
