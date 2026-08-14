// by sahishnu patil 
//on 14 aug 26 at 13:01


class Solution {
    
   
    void f(int i, int arr[], int n) {
        if (i >= n / 2) return;   
    
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        
       
        f(i + 1, arr, n);
    }
    
    public void reverseArray(int arr[]) {
        f(0, arr, arr.length);
    }
}
