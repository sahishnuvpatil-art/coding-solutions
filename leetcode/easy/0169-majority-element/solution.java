class Solution {
    public int majorityElement(int[] nums) {
         int l=nums.length;
        int newl=0;
        int ans=0;
        if(l%2==0){
          newl=l/2;
        }else{
            newl=(l/2);
        }
        Arrays.sort(nums);
        if(nums[l-1]==nums[newl]){
           ans=nums[l-1];

        }else{
            ans=nums[0];
        }
        ans=ans*1;
        return ans;
    }
}