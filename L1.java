import java.util.HashMap;

/**
 * @Description TODO
 * @Date 2024/4/29 21:42
 * @Created by lenovo
 */
public class L1 {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
               if(map.containsKey(target - nums[i])) {
                   return new int[]{map.get(target - nums[i]), i};
               }
                map.put(nums[i], i);
               };

            return new int[]{-1, -1};
        }

    }
}
