public class F2_Char {

    public static void main(String[] args) {
        char target = 'd';
        char[] arr = { 'a', 'c', 'd', 'w', 'z' };
        System.out.println(nextGreatestLetter(arr, target));
        System.out.println(PreviousGreatestLetter(arr, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

    public static char PreviousGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[end % letters.length];
    }
}