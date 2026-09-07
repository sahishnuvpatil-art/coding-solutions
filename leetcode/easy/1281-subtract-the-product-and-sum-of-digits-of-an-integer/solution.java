class Solution {
    public int subtractProductAndSum(int n) {
        int psum=1;
        int sd=0;
        while(n>0){
            int rem=n%10;
            psum*=rem;
            sd=sd+rem;
            n/=10;
        }
        return psum-sd;
    }
}