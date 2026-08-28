class Solution {
    public int[] searchRange(int[] nums, int target) {
     return new int[]{
        first(nums, target), last(nums, target)
       };
      }
       private int first(int[] nums,int target){
        int result =-1;
        int low=0;
        int high=nums.length-1;
          while(low<=high){
            int mid=low+(high-low)/2; 
            if(nums[mid]==target){
               result=mid;
               high=mid-1;
            }
            else if(nums[mid]<target){
              low=mid+1;
            }
            else{
                high=mid-1;
            }
          }

          return result;
       }
        private int last(int[] nums,int target){
            int result =-1;
        int low=0;
        int high=nums.length-1;
          while(low<=high){
            int mid=low+(high-low)/2; 
            if(nums[mid]==target){
               result=mid;
               low=mid+1;
            }
            else if(nums[mid]<target){
              low=mid+1;
            }
            else{
                high=mid-1;
            }
          }
        return result;
    }
}