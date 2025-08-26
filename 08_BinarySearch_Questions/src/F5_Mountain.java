public class F5_Mountain {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 8, 9, 11, 16, 17, 5, 4, 3, 2, 1 };
        System.out.println("Peak Element is at index: " + peakElementMountainArray(arr) + " ("
                + arr[peakElementMountainArray(arr)] + ")");
    }

    // Question --> Find Peak in mountain array; // does not contain duplicate
    // elements
    // ex: 0,1,0 ans-> 1
    // ex: 0,2,1,0 ans-> 2
    /// 0 1 2 3 4 5 6 7
    /// s-----m-------e
    // [1,2,3,5,6,4,3,2]
    // if e[mid] > e[mid+1] --> we are at decreasing part of array // end = mid //
    // we can still check the privious element
    // if e[mid] < e[mid+1] --> we are at increasing part of array // start = mid+1;
    // loop break --> start = end;

    public static int peakElementMountainArray(int[] arr) {
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
