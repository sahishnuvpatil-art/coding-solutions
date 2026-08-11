
class Solution {
    int count =1;
    
    void p(int n){
    if(count>n) return;
    
    System.out.print(count+" ");
    count++;
    p(n);
    
}

    public void printTillN(int n) {
       
        p(n);
    }
}