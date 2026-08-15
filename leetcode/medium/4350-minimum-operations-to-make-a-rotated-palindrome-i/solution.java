class Solution {
    public int minOperations(String s) {
      int length=s.length();
        int  minToves=Integer.MAX_VALUE;

        for(int a=0;a<length;a++){
            int cMoves=a;

            int chalu=0;
            int band=length-(2-1);

            while (chalu <band){
                char Sa=s.charAt((a+chalu)%length);
                char Ba=s.charAt((a+band)%length);
                if(Sa!=Ba){
                    int dista=Math.abs(Sa-Ba);
                    cMoves=cMoves+Math.min(dista,26-dista);
                }
                chalu++;
                band--;
            }
            if(cMoves<minToves)minToves=cMoves;
        }
        return minToves;
    }
}