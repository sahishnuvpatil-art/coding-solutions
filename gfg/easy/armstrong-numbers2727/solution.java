class Solution {
    static boolean armstrongNumber(int n) {
        if(n<11)return false;
        
        int arm=0; int temp=n;
        while(temp>0){
         int ld=temp%10;
         int s=ld*ld*ld;
         arm+=s;
         temp/=10;
         
        }
        if(arm==n)return true;
        else return false;
        
    }
}