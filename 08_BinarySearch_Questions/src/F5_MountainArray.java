public class F5_MountainArray {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 0 };
        System.out.println(peakIndexMounatinArray(nums));
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
// arr = [1,2,3,5,7,6,3,2] // bitonic array
// target = peak index; or laregst no in the mountain array;

// Question --> Find Peak in mountain array; // does not contain duplicate
// elements
// ex: 0,1,0 ans-> 1
// ex: 0,2,1,0 ans-> 2
/// 0 1 2 3 4 5 6 7
/// s-----m-------e
// [1,2,3,5,6,4,3,2]
// if e[mid] > e[mid+1] --> we are at decreasing part of array // end = mid
// if e[mid] < e[mid+1] --> we are at increasing part of array // start = mid+1;
// loop break --> start = end;
