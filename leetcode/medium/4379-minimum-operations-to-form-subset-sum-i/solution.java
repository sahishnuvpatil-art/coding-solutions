class Solution {
    public int minOperations(int[] nums, int sum) {
        int inf=10*100000;
        int sp[]=new int [sum+1];
        Arrays.fill(sp,inf);
        sp[0]=0;

        for(int x:nums){
            int svp[]=sp.clone();
            int c=0;
            int v=x;
            while(v<=sum){
                for(int i=v;i<=sum;i++){
                    if(sp[i-v]+c<=svp[i]){
                        svp[i]=sp[i-v]+c;
                    }
                }
                v=v*2;
                c++;
            }
            v=x;
            c=0;
            while(v>0){
                v=v/2;
                c++;
                for(int i=v;i<=sum;i++){
                    if(sp[i-v]+c<svp[i]){
                        svp[i]=sp[i-v]+c;
                    }
                }
            }
            sp=svp;
            
            
        }
        if(sp[sum]==inf){
            return -1;
        }else{
        return sp[sum];
        }
    }
}