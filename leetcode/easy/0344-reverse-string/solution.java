// by sahishu patil
//on 14 aug 26 at 12:46


class Solution {
    
    void f(int i, char[] s, int n) {
        if (i >= n / 2) return; 
       
        char temp = s[i];
        s[i] = s[n - i - 1];
        s[n - i - 1] = temp;
        
      
        f(i + 1, s, n);
    }

    public void reverseString(char[] s) {
        f(0, s, s.length);
    }
}
