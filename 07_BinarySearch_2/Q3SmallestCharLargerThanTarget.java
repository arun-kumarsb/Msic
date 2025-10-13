public class Q3SmallestCharLargerThanTarget {
    // static char nextGreatestLetter(char[] arr, char target){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start <= end) {
    //         int mid = start + (end - start)/2;
    //         if(target > arr[mid]){
    //             start = mid + 1;
    //         }
    //         else if (target < arr[mid]) {
    //             end = mid - 1;
    //         }
    //         if (start == arr.length) {
    //             return arr[0];
    //         }
    //     }
    //     return arr[start];
    // }

    // or using [start%arr.length]
    static char nextGreatestLetter(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return arr[start%arr.length];
    }

    // Example usage
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target)); // Output: c
    }
}