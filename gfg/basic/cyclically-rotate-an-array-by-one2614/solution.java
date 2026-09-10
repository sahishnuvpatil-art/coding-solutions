class Solution {
    public void rotate(int[] arr) {
             int n =arr.length;
                int last = arr[arr.length- 1];

                // Shift all elements one step to the right
                for (int i = n - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }

                // Place the last element at the front
                arr[0] = last;
            
    }
}