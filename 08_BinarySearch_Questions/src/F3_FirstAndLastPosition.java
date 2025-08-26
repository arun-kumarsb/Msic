import java.util.Arrays;

public class F3_FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int target = 7;
        System.out.println(Arrays.toString(SearchRange(nums, target)));
    }

    /// 0 1 2 3 4 5 6 7
    // [5,7,7,7,7,8,8,10] target = 7;
    // ans = [1,4]
    // whenever we find a 7 there are 2 posibility
    // first occurence of 7 ---> middile is index 3 henece 7
    /// s-----m-------e
    /// 0 1 2 3 4 5 6 7
    // [5,7,7,7,7,8,8,10]

    // now if we want to search 1st index we just have to update end to mid - 1; and
    // binary search will run again;

    /// s-m-e----------
    /// 0 1 2 3 4 5 6 7
    // [5,7,7,7,7,8,8,10]
    // or else we can update start to mid + 1; for last index
    /// --------s-m---e
    /// 0 1 2 3 4 5 6 7
    // [5,7,7,7,7,8,8,10]

    public static int[] SearchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ans[0] = SearchIndex(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = SearchIndex(nums, target, false);
        }
        return ans;
    }

    // this func return the index value of the target
    public static int SearchIndex(int[] nums, int target, boolean isFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (isFirstIndex) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
        }
        return ans;
    }
}
