class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sahi , wakt ;
        sahi =0;
        wakt =0;
        int length=requests.length;
        for(int a=0; a<length;a++){
            wakt=wakt+Math.abs(requests[a]-sahi);
            sahi=requests[a];
        }
        return wakt;
    }
}