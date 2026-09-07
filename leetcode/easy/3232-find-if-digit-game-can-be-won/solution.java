class Solution {
    public boolean canAliceWin(int[] nums) {
        int dsum=0;
        int ssum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                ssum+=nums[i];
            }else{
                dsum+=nums[i];
            }
        }
        if(ssum==dsum)return false ;
        else return true;
    }
}