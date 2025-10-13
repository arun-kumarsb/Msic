public class F2DBinarySearch {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        System.out.println(DBinarySearch(arr, 5));
    }
    static int DBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // int mid = (start+end)/2;
            // has a problem
            // if start and end are too large then there is a point when start + end exeed
            // the range of integer
            int mid = start + (end - start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
