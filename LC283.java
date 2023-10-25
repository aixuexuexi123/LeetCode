public class LC283 {
//    public void moveZeroes(int[] nums) {
//        int end=nums.length-1;
//        for (int i = nums.length-1; i >0; i--) {
//            if(nums[i]==0) {
//                for (int j = i; j < end; j++) {
//                    nums[i] = nums[i + 1];
//                }
//                nums[end] = 0;
//                end--;
//            }
//        }
//    }

    public void moveZeroes(int[] nums) {
        int start=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[start]=nums[i];
                start++;
            }
        }
        for (int i = start; i < nums.length; i++){
            nums[i]=0;
        }
    }
}
