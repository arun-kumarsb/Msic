

public class F7_MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 5 },
                { 7, 3 },
                { 3, 5 }
        }; // 6
        System.out.println(MaximumWealth(accounts));
    }

    public static int MaximumWealth(int[][] accounts) {
        int max = SumOfArray(accounts[0]);
        for (int i = 0; i < accounts.length; i++) {
            if (SumOfArray(accounts[i]) > max) {
                max = SumOfArray(accounts[i]);
            }
        }
        return max;
    }

    public static int SumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
