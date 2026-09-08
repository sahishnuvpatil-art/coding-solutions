class Solution {
    public int findNumbers(int[] nums) {
        int rcount=0;
        
        for(int i=0;i<nums.length;i++){
            int count=0;
            int temp=nums[i];
            if(temp>9){
               
            while(temp>0){
               temp/=10;
              count++;
            }
            if(count%2==0)rcount++;
        }
        
        }
        return rcount;
    }
}