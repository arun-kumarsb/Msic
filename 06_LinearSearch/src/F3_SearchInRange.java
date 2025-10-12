

public class F3_SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 5,7, 14, 28 };
        System.out.println(arr.length);

        // search for 3 in the range of index [1,4]
        int target = 3;
        System.out.println(SearchInRange(1, 7, arr, target));
    }

    static int SearchInRange(int start, int end,int arr[], int target){
        if (arr.length == 0) {
            return -1;
        }
        if (start > end) {
            return -1;
        }
        if (end >= arr.length) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        
        return -2;
    }
}
