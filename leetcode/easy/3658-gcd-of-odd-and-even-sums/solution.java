class Solution {
    static int f(int a,int b){
        if(b==0)return a;
        return f(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int a=n*n;
        int b=n*(n+1);
        return f( a,b);
    }
}