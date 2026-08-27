class Solution {
    public int searchInsert(int[] nums, int target) {

      int a=nums.length-1;
      for(int i=0;i<=a;i++){
        if(nums[i]==target){
            return i;
        }else if (nums[i] >= target) {
                return i;
            }
        }

     
        return a+1;
    }
}