public class Q8 {
    public static int FindPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }
            else if (arr[mid] < arr[end]){
                end = mid - 1;
            }
        }
        return -1;
    }
    static int BinarySearch(int[] arr, int target, int start, int end){
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target == arr[mid]) {
                return  mid;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    // static int SearchInRotatedArray(int[] arr, int target){
    //     int pivot = FindPivot(arr);
    //     int index = BinarySearch(arr, target, 0, pivot);
    //     if (index == -1) {
    //         return BinarySearch(arr, target, pivot, arr.length - 1);
    //     }
    //     return index;
    // }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9,1,2};
        System.out.println("Pivot: "+ FindPivot(arr));
        // System.out.println(SearchInRotatedArray(arr, 7));
    }
}
