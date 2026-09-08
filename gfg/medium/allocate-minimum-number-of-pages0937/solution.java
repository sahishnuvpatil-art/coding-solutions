class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length){
            return -1;
        }
        long low=0;
        long high=0;
       
        
        for(int page:arr){
            low=Math.max(low,page);
            high+=page;
        }
        long ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(ispossible(arr,k,mid)){
               ans=mid;
               high=mid-1;
            }else{
                low=mid+1;
            }
            
            
        }
        return (int)ans;
    }
    private boolean ispossible(int []arr, int k , long maxpages){
        int student =1;
        int curpage=0;
        for(int pages:arr){
            if(curpage+pages<=maxpages){
                curpage+=pages;
            }else{
                student++;
                curpage=pages;
                if(student>k)return false;
            }
        }
        return true;
    }
}