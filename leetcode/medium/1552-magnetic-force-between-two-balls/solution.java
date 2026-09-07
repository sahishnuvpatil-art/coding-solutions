class Solution {
    public int maxDistance(int[] arr, int k) {
        Arrays.sort(arr);
        int low=1;
        int high=(arr[arr.length-1]-arr[0]);
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canplace(arr,k,mid)){
                ans=mid;
               low=mid+1;

            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    private boolean canplace(int []arr,int k , int dist){
        int cows=1;
        int prev=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-prev>=dist){
                cows++;
                prev=arr[i];
            }
        }
        if(cows>=k)return true;
        else return false;
    }
}