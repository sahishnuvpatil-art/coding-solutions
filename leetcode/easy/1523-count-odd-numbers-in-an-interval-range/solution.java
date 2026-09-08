class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        int newl=0;
        if(low%2!=0){
            newl=low;

        }else{
            newl=low+1;
        }
        for(int i=newl;i<=high;i=i+2){
            count++;
        }
        return count;
    }
}