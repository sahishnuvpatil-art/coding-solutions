class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
                if(count>=3){
                    c++;
                }
            }else{

             count =0;
             }
        }
        if(c==0)return false;
        else return true;
       }
}