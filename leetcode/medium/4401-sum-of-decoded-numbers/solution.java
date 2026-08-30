class Solution {
    public int sumDecoded(long[] nums) {
        long chota=0;
        
        

        for(long n:nums){
            int wow=(int)(n%10);
            n=n/10;

        
            String sahi=""+n;

            int be=Integer.parseInt(sahi.substring(0,wow));
            int bee=Integer.parseInt(sahi.substring(wow));

            long p=1;
            long x=be;
            while(bee>0){
                if(bee%2==1){
                    p=p*x%1000000007;
                    
                }
                x=(x*x)%1000000007;
                    bee=bee/2;
               
            }
             chota=(chota+p)%1000000007;

            
        }
        return(int)chota;
    }
}