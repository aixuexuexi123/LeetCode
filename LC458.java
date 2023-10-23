public class LC458 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count += 1;

            } else {
                if (count > result) {
                    result = count;
                }
                count = 0;
            }
        }
        result=result>count?result:count;
        return result;
    }
}
