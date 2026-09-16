class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];

        int currmax=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]+currmax>nums[i]){
                currmax+=nums[i];
            }else{
                currmax=nums[i];
            }if(max<currmax){
                max=currmax;
                            }
        }
        return max;
    }
}