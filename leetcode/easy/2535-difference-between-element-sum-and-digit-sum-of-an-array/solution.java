class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0;
        int dsum=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>9){
                int rem=0;
                int temp=nums[i];
                while(temp>0){
                   rem=temp%10;
                    dsum+=rem;
                    temp/=10;
                }
            }else{
                dsum+=nums[i];
            }
        }for(int j=0;j<nums.length;j++){
            esum+=nums[j];
        }
        return esum-dsum;
    }
}