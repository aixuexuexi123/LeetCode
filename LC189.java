import java.util.Arrays;

/**
 * @Author: Mr.Yue
 */
public class LC189 {
    public void rotate(int[] nums, int k) {
        int []nums2=new int[nums.length];
        for (int i = 0; i < nums.length-k; i++) {
            nums2[i+k]=nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums2[i]=nums[nums.length-k];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=nums2[i];
        }
    }
}
