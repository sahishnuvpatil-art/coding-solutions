class Solution {
    public int rowWithMax1s(int[][] arr) {
        // code here
        int n=arr.length;
        int m=arr[0].length;
        int row =0;
        int col=m-1;
        int max=-1;
        while(row<n && col>=0){
            if(arr[row][col]==1){
                max=row;
                col--;
                
            }else{
               row++;
            }
        }
        return max;
        
    }
};