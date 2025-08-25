public class F2_Char {

    public static void main(String[] args) {
        char target = 'd';
        char[] arr = {'a','c','d','w', 'z'};
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = (letters.length - 1);
        while (start <= end) {
            int mid = start - (end + start) / 2;
            if (target > letters[mid]) {
                start = mid + 1;
            } else if (target < letters[mid]) {
                end = mid - 1;
            }
            if (target == 'z') {
                return 'a';
            } else {
                return letters[mid + 1];
            }
        }
        return letters[start];
    }
}