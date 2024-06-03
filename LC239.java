import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: Mr.Yue
 */
public class LC239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[0];
        }
        int max=-100000;

       int[] res = new int[nums.length-k+1];
       int [] result = new int[1];
        for (int i = 0; i < nums.length-k+1; i++) {
            for (int j = i; j <i+k; j++) {
               max= Math.max(max,nums[j]);
            }
            res[i]=max;
            max=-100000;
        }
        return res;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] res = maxSlidingWindow(nums, k);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
