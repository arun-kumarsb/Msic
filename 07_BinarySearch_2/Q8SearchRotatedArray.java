public class Q8SearchRotatedArray {
    public static void main(String[] args) {
        int[] arr = { 7,8,9,0,1,2,3,4,5,6 };
        int target = 8;
        // System.out.println(pivot(arr));
        System.out.println(SearchInRotatedArray(arr, target));
    }
    static int SearchInRotatedArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] >= arr[start]) { 
                if(target <= arr[mid] && target >= arr[start]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(target >= arr[mid] && target <= arr[end]){
                    // our target in right sorted half 
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
