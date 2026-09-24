class Solution {
    static int tmc(int a ,int b){
        if(b==0)return a;
        return tmc(b,a%b);
    }
    public static int gcd(int a, int b) {
        return tmc(a,b);
        
    }
}
