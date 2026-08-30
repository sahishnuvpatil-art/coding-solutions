class Solution {
    public int countSpecialIntegers(int[] nums) {
       int c[]=new int [101];
        for (int a=0;a<nums.length ;a++){
            if(a==0||  nums[a]!=nums[a-1]){
                
            c[nums[a]]++;
            }
            
        }
        int s=0;
        for (int a=1;a<=100;a++){
            if(c[a]==1)s++;
                
            
        }
        return s;
    }
}