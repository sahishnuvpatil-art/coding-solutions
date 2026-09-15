class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int  count=0;
        int mcount=0;
         for(int n:nums ){
            if(n==1){
                count++;
            }else{
                count=0;
            }
            if(mcount<count)mcount=count;
         }
         return mcount;
    }
}