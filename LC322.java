import java.util.Arrays;

/**
 * @Author: Mr.Yue
 */
public class LC322 {
    public int coinChange(int[] coins, int amount) {

        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

}