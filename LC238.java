/**
 * @Author: Mr.Yue
 */
public class LC238 {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length==0){
            return new int[0];
        }
        int res[] =new int[nums.length];
        res[0]=1;
        for (int i = 1; i < nums.length; i++) {
          res[i]=res[i-1]*nums[i-1];
        }
        int tempt=1;
        for (int i = nums.length-2 ; i >=0; i--) {
            tempt*=nums[i];
            res[i]*=tempt;
        }
        return res;
    }
}
