class Solution {
    public int countCommas(int n) {
        int comas=0;
        if(n<1000){
return 0;
        } 

        else {
            for(int i=1000;i<=n;i++){
        int temp=n;
        if(temp/1000>0){
            comas++;
            temp/=1000;
        }
        }
        }
        return comas;
    }
}