

public class F6_FindNubers {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int temp = digit(num);
        if (temp % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digit(int num) {
        int count = 0;
        if (num < 0) {
            num = num * 1;
        }
        if (num == 0) {
            return 1;
        }
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
