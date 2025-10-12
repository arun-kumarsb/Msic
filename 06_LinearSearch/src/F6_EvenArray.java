

public class F6_EvenArray {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int digits = 0;
            int temp = arr[i];
            while (temp != 0) {
                digits++;
                temp /= 10;
                
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
