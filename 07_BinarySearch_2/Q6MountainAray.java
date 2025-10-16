public class Q6MountainAray {
    public static void main(String[] args) {
        int arr[] = {1,2,7,8}; 
        System.out.println(peakElement(arr));
    }
    // my logic
    // static int peakElement(int[] arr) {
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start<=end) // problem {
    //         int mid = start + (end - start)/2;
    //         if (arr[mid] < arr[mid+1]) {
    //             start = mid + 1;
    //         }

    //         else{
    //             end = mid - 1; // problem
    //         }
    //     }
    //     return start;
    // }

    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start<end) {
            int mid = start + (end - start)/2;
            if (arr[mid] < arr[mid+1]) {
                // increaing part of array the answer is definately lie after that but not this
                start = mid + 1;
            }

            else{
                // decreasing part of array this is my potential answer but more answer can lie before this
                end = mid;
                // this is why end != mid - 1;
            }
        }
        return end;
        // return start; // or 
    }
}
