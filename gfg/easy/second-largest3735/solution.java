class Solution {
    public int getSecondLargest(int[] arr) {
        int lar = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lar) {
               
                second = lar;
                lar = arr[i];
            } else if (arr[i] > second && arr[i] < lar) {
               
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) return -1;
        return second;
    }
}
