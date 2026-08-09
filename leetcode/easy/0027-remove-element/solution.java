class Solution {
    public int removeElement(int[] nums, int val) {
       int s=nums.length-1;
        int index=0;

       for(int i=0;i<=s;i++){
        if(nums[i]!=val){
           nums[index]=nums[i];
           index++;

        }
       }
       return index;
    }
}