public class F2_BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
        int target = 36;
        System.out.println(BinarySearch(target, arr));
    }
    // return the index
    public static int BinarySearch(int target, int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start + end)/2; // can give error
            // better way to find mid
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
