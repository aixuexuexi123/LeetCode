import java.util.Arrays;

/**
 * @Author: Mr.Yue
 */
public class LC41 {
    public int firstMissingPositive(int[] nums) {
        int res=1;
        int count=0;
        Arrays.sort(nums);
        if (nums.length==1){
            if (nums[0]<=0||nums[0]>1){
                return 1;
            }else if (nums[0]==1){
                return 2;
            }

        }
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i+1]-nums[i]>1){
                if (nums[i]>0){
                    res= nums[i]+1;
                    break;
                }

            }
            count+=1;
            if (nums[0]>1||nums[nums.length-1]<=0){
                res= 1;
                break;
            }
            if (count==nums.length-1){
                res=nums[nums.length-1]+1;
            }
        }
        return res;
    }
}
