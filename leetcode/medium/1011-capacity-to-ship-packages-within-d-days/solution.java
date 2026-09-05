class Solution {
    public int shipWithinDays(int[] nums, int k) {
        
       
        int low=0;
        int high=0;

        int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            sum+=nums[i];
        }
        low=max;
        high=sum;
        
        while(low<high){
            int mid=(low+high)/2;
            int parts=1;
            int currentsum=0;

            for(int i=0;i<nums.length;i++){
                if(currentsum+nums[i]>mid){
                    parts++;
                    currentsum=nums[i];
                }
                else{
                    currentsum+=nums[i];
                }
            }
            if(parts>k){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}
   