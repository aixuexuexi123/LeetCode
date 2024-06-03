import java.util.Arrays;

/**
 * @Author: Mr.Yue
 */
public class LC198 {
    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[nums.length+1];

        dp[0] = 0;
        dp[1] = nums[0];
        for (int i =1; i < nums.length; i++) {
         dp[i+1]=Math.max(dp[i],dp[i-1]+nums[i]);
        }
    return dp[nums.length];

    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};

        int res = rob(nums);
        System.out.println(res);
    }
}
