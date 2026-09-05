class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=nums.length;
        int count=0;
        int maxCount=0;

        for(int i=0;i<l;i++){
            
            

         if(nums[i]==1){
            count++;
         }else{
            count=0;
         }
         if(maxCount<count){
                maxCount=count;
         }
        }
        
        return maxCount;
    }
}