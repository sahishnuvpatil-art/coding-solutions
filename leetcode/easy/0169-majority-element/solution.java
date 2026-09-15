class Solution {
    public int majorityElement(int[] nums) {
         int l=nums.length/2;
         Arrays.sort(nums);
         int ans=nums[l];
         return ans;
        
    }
}