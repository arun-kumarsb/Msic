public class F1Algorithim {
    public static void main(String[] args) {
        int[] arr = new int[] {2,4,6,9,11,12,14,20,36,48};
        int target = 36;
        System.out.println(BinarySearch(target, arr));
    }

    // algorithim
    static int BinarySearch(int target, int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            // int mid = (start+end)/2;
            // has a problem
            // if start and end are too large then there is a point when start + end exeed
            // the range of integer
            int mid = start + (end - start)/2;
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
     
}
